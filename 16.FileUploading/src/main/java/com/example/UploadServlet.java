package com.example;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@MultipartConfig
public class UploadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String UPLOAD_DIRECTORY = "/tmp/uploads/";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (!ServletFileUpload.isMultipartContent(request)) {
            response.getWriter().println("Error: Form must contain enctype=multipart/form-data");
            return;
        }

        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);

        try {
            List<FileItem> fileItems = upload.parseRequest(request);

            for (FileItem item : fileItems) {
                if (!item.isFormField()) {
                    String fileName = new File(item.getName()).getName();
                    File uploadFile = new File(UPLOAD_DIRECTORY + fileName);
                    item.write(uploadFile);
                    response.getWriter().println("File Uploaded: " + fileName);
                }
            }
        } catch (Exception ex) {
            response.getWriter().println("File Upload Failed: " + ex.getMessage());
        }
    }
}
