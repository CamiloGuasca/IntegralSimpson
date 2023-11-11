<%-- 
    Document   : index
    Created on : Nov 7, 2023, 10:09:51 PM
    Author     : camilog
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="estilo.css?v=1"/>
        <title>Regla De Simpson</title>
    </head>
    <body>
        <nav>
            <h2>Regla De Simpson</h2>
        </nav>
        <section>
            <form action="intControl" method="post">
                <input type="text" name="txtIntsup" placeholder="Int Superior">
                <input type="text" name="txtFunc" placeholder="Función">
                <input type="text" name="txtIntinf" placeholder="Int Inferior">
                <input type="number" name="txtDivi" placeholder="Invertvalos">
                <br>
                <input type="submit" name="accion" value="Integrar">
            </form>
        </section>    
        <%
            double[][] listaXK = (double[][]) request.getAttribute("lista");
            Object totalObj = request.getAttribute("total");
            double to = (totalObj != null) ? ((Double) totalObj).doubleValue() : 0.0;

            if(listaXK != null){
        %>
        <section>
            <h1>Total: <%=to%></h1>
        </section>
        <section>
            <table>
                <thead>
                    <th>K</th>
                    <th>xK</th>
                    <th>f(xK)</th>
                    <th>ms</th>
                    <th>ms f(xK)</th>
                </thead>
                <tbody>
                    <%
                            for(int c = 0; c < listaXK.length ; c++){
                    %>
                    <tr>
                        <td><%=c%></td>
                        <td><%=listaXK[c][0]%></td>
                        <td><%=listaXK[c][1]%></td>
                        <td><%=c%2==0 ? 2 : 4%></td>
                        <td><%=listaXK[c][2]%></td>
                    </tr>   
                    <%
                            } 
                    %>
                </tbody>    
            </table>    
        </section>
        <%}%>
        <footer>
        </footer>
    </body>
</html>
