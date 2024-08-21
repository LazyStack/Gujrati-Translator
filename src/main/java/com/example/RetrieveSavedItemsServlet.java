package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.ArrayList;

@WebServlet("/retrieve-saved-items")
public class RetrieveSavedItemsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO: Retrieve saved words from a database or a file
        List<String> savedWords = new ArrayList<>();
        savedWords.add("Example Word 1");
        savedWords.add("Example Word 2");

        request.setAttribute("savedWords", savedWords);
        request.getRequestDispatcher("saved-items.jsp").forward(request, response);
    }
}
