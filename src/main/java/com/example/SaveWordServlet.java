package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save-word")
public class SaveWordServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve word and language from the form
        String word = request.getParameter("word");
        String language = request.getParameter("language");

        // TODO: Save the word to a database or a file
        // This is just an example, so we're printing it to the console
        System.out.println("Word: " + word + ", Language: " + language);

        // Redirect to a confirmation or list page
        response.sendRedirect("saved-items.html");
    }
}
