<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Detalles del equipo</title>
</head>
<body style="background-color: #2C3639;">
	<header>  
        <!-- Jumbotron -->
        <div class="p-5 text-center bg-light" style="width: 100%;">
          <h1 class="mb-3" style="font-size: 100px; font-family: Copperplate Gothic;">${listOne.get(0).getNombreEquipo()}</h1>
        </div>
        <div class="row">
            <div class="col">
                <div class="row">
                    <div class="col">
                        <div class="card mt-4 ml-2" style="width: 100%;">
                            <div class="card-body">
                              <h5 class="card-title">ÚLTIMAS VOTACIONES</h5>
                              <p class="card-text">LISTA VOTACIONES</p>
                              <p class="card-text">LISTA VOTACIONES</p>
                              <p class="card-text">LISTA VOTACIONES</p>
                              <p class="card-text">LISTA VOTACIONES</p>
                              <p class="card-text">LISTA VOTACIONES</p>
                            </div>
                          </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <div class="card mt-4 ml-2" style="width: 100%;">
                            <div class="card-body">
                              <h5 class="card-title">NO SE QUE PONER</h5>
                              <p class="card-text">PRUEBA</p>
                              <a href="#" class="btn btn-primary">Go somewhere</a>
                            </div>
                          </div>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card mt-4" style="width: 100%;background-color:#3F4E4F; border-color: #A27B5C; ">
                    <div class="card-body">
                      <div class="card-header text-center mb-2" style="background-color: #262B30">
                        <h2 style="color: white; font-family:Copperplate Gothic;">PARTICIPANTES</h2>
                      </div>
                      <div class="row">
                        <div class="container col">
                          <c:forEach var="integrante" items="${listIntegrantes}" varStatus="indice">
                            <p class="card-text mb-3 mt-3" style="font-size: large; color: white  ">${integrante.getNombre()}</p>
                            <p class="container">
                              <form class="" method="get" action="EliminarParticipante">
                                <input type="hidden" name="idParticipante" value="${integrante.getId()}"/>
                                <!-- <input type="submit" value="Eliminar participantes" class="btn btn-primary "/> -->
                              </form>
                            </p>
                          </c:forEach>
                        </div>
                        <div class="col">
                          <p class="card-text mb-3 mt-3" style="font-size: large;">
                            
                          </p>
                        </div>
                      </div>
                      <form method="get" action="AñadirParticipante" >
                        <input type="hidden" name="idEquipo" value="${listOne.get(0).getId()}"/>
                        <input type="submit" value="Añadir participantes" class="btn btn-primary "/>
                      </form>
                      <!-- cambiar el .jsp -->
                    </div>
                  </div>
            </div>
        </div>
        <!-- Jumbotron -->
      </header>
</body>
</html>