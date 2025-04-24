package com.example;

import org.junit.jupiter.api.Test;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import static org.mockito.Mockito.*;

public class HelloServletTest {
    @Test
    public void testHelloServlet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PrintWriter writer = mock(PrintWriter.class);

        when(response.getWriter()).thenReturn(writer);

        HelloServlet servlet = new HelloServlet();

        servlet.doGet(request, response);
        verify(response).getWriter();

        System.out.println("com.example.HelloServlet test executed.");
    }
}