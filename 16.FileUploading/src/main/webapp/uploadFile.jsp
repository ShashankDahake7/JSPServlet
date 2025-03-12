<%@ page import="java.io.File" %>
<%@ page import="java.util.List" %>
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="org.apache.commons.fileupload.disk.DiskFileItemFactory" %>
<%@ page import="org.apache.commons.fileupload.servlet.ServletFileUpload" %>

<%
String filePath = application.getInitParameter("file-upload");
if (ServletFileUpload.isMultipartContent(request)) {
    DiskFileItemFactory factory = new DiskFileItemFactory();
    ServletFileUpload upload = new ServletFileUpload(factory);

    try {
        List<FileItem> fileItems = upload.parseRequest(request);
        for (FileItem item : fileItems) {
            if (!item.isFormField()) {
                String fileName = new File(item.getName()).getName();
                File file = new File(filePath + fileName);
                item.write(file);
%>
<p>Uploaded File: <%= fileName %></p>
<%
            }
        }
    } catch (Exception ex) {
%>
<p>Error: <%= ex.getMessage() %></p>
<%
    }
} else {
%>
<p>No file uploaded.</p>
<%
}
%>
