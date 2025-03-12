<%@ page import="javax.xml.parsers.*, org.w3c.dom.*, java.io.*" %>

<%
    // Simulating XML data
    String xmlData = "<books>"
            + "<book><title>Effective Java</title><author>Joshua Bloch</author></book>"
            + "<book><title>Clean Code</title><author>Robert C. Martin</author></book>"
            + "</books>";

    // Parse the XML using Java DOM
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    InputStream is = new ByteArrayInputStream(xmlData.getBytes());
    Document doc = builder.parse(is);
    NodeList books = doc.getElementsByTagName("book");
%>

<html>
<head><title>XML Parsing with Java</title></head>
<body>

<h2>Books List</h2>
<ul>
    <% for (int i = 0; i < books.getLength(); i++) {
        Element book = (Element) books.item(i);
        String title = book.getElementsByTagName("title").item(0).getTextContent();
    %>
        <li><%= title %></li>
    <% } %>
</ul>

</body>
</html>
