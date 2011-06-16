<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="java.util.Date"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>Sistema de Ventas RTM</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link href="img/stylesheet.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
body {
	background-color: #000000;
}
.Estilo2 {
	font-size: 18px;
	color: #FFFFFF;
}
.Estilo3 {
	font-size: 16px;
	font-family: Arial, Helvetica, sans-serif;
	font-weight: bold;
	color: #B8B8B8;
}
.Estilo4 {
	font-size: 36px;
	color: #FFFFFF;
	font-weight: bold;
	font-family: Arial, Helvetica, sans-serif;
}
.Estilo7 {color: #B8B8B8}
.Estilo13 {color: #000000; font-weight: bold; font-family: Arial, Helvetica, sans-serif; font-size: 18px; }
.Estilo17 {color: #000000}
.Estilo18 {color: #000000; font-weight: bold; font-family: Arial, Helvetica, sans-serif; font-size: 12px; }
.Estilo27 {font-family: Arial, Helvetica, sans-serif}
.Estilo40 {font-family: Arial, Helvetica, sans-serif; font-size: 11px; }
.Estilo48 {font-family: Arial, Helvetica, sans-serif; font-weight: bold; font-size: 12px; }
.Estilo52 {font-weight: bold; font-size: 11px; color: #FFFFFF; }
.Estilo54 {font-family: Arial, Helvetica, sans-serif; font-weight: bold; }
.Estilo56 {font-family: Arial, Helvetica, sans-serif; font-weight: bold; font-size: 11px; }
.Estilo57 {font-size: 11px}
-->
</style>

<script type="text/javascript">

function finalizar()
{
	document.formularioPedido.accion.value = 'finalizar';
	document.formularioPedido.submit();
}

function atras()
{
	document.formularioPedido.accion.value = 'atras';
	document.formularioPedido.submit();
}

</script>

</head>
<body>
<form name="formularioPedido" method="get" action="<%=request.getContextPath()%>/registrarPedido.do">
<input type="hidden" name="accion" value=""/>

<table width="100%" bgcolor="#000000">
<tr>
<td height="587" valign="top">
<table cellpadding="0" cellspacing="0" border="0" class="main" align="center" width="70%">
	<tr>
	  <td height="78" colspan="3" align="center"><img src="img/logo.JPG" width="832" height="141"></td>
	</tr>
	<tr>
	  <td height="83" colspan="3" align="center"><p class="Estilo4 Estilo7">BIENVENIDOS A RTM</p>
	    <p class="Estilo2 Estilo3">EMPRESA LIDER EN VENTA DE REPUESTOS </p></td>
	  </tr>
	<tr>
	  <td height="4" colspan="2" valign="middle"><img src="../free_osCommerce_template/sources/html/images/spacer.gif" width="1" height="1"></td>
	  </tr>
	<tr>
	  <td width="20%" height="144" valign="top" bgcolor="#FFFFCC" class="footer"><table width="100%" border="0">
        <tr>
          <td bgcolor="#FFFFCC">&nbsp;</td>
          <td bgcolor="#FFFFCC"><span class="Estilo13">VENDEDOR</span></td>
        </tr>
        <tr>
          <td bgcolor="#FFFFCC">&nbsp;</td>
          <td bgcolor="#FFFFCC"><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td height="30" bgcolor="#FFFFCC"><img src="img/bullet1.gif" width="9" height="12"></td>
          <td bgcolor="#FFFFCC"><a href="<%=request.getContextPath() %>/buscarCliente.do"><span class="Estilo18">Consulta de Cliente</span></a></td>
        </tr>
        <tr>
          <td height="30"><img src="img/bullet1.gif" width="9" height="12"></td>
          <td><a href="<%=request.getContextPath() %>/buscarProducto.do"><span class="Estilo18">Consulta de Productos</span></a></td>
        </tr>
        <tr>
          <td height="26"><img src="img/bullet1.gif" width="9" height="12"></td>
          <td><a href="#"><span class="Estilo18">Consulta de Existencias</span></a></td>
        </tr>
        <tr>
          <td height="29"><img src="img/bullet1.gif" width="9" height="12"></td>
          <td><a href="<%=request.getContextPath() %>/buscarDocumentos.do"><span class="Estilo18">Consulta de Credito </span></a></td>
        </tr>
        <tr>
          <td height="30"><img src="img/bullet1.gif" width="9" height="12"></td>
          <td><a href="#"><span class="Estilo18">Consulta de Pedidos</span></a></td>
        </tr>
        <tr>
          <td height="23"><img src="img/bullet1.gif" width="9" height="12"></td>
          <td><span class="Estilo18">Registro de Pedidos</span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
      </table></td>
	  <td width="80%" valign="top" bgcolor="#FFFFCC" class="footer"><table width="100%" border="0" bgcolor="#FFFFCC">
        <tr>
          <td width="2%"><table width="100%" border="0">
              <tr>
                <th width="3%" scope="row"><span class="Estilo27"></span></th>
                <td colspan="4"><span class="Estilo13">REGISTRO DE PEDIDO </span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td width="20%"><span class="Estilo27"></span></td>
                <td width="33%"><span class="Estilo27"></span></td>
                <td width="19%"><span class="Estilo27"></span></td>
                <td width="25%"><span class="Estilo27"></span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo40">Pedido Nro : </span></td>
                <td><span class="Estilo27">
                  <input name="txtCodPedido" type="text" id="txtCodPedido" value="${model.codigoPedido}">
                </span></td>
                <td><span class="Estilo40">Fecha : </span></td>
                <td><span class="Estilo27">
                  <input name="txtFecha" type="text" id="txtFecha" disabled="disabled" value="<fmt:formatDate value="<%=new Date()%>" pattern="dd-MM-yyyy" />">
                </span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"><img src="img/bullet1.gif" width="9" height="12"></span></th>
                <td><span class="Estilo48">Datos del Cliente </span></td>
                <td>&nbsp;</td>
                <td colspan="2">&nbsp;</td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo40">Nombre/Rz Social : </span></td>
                <td>
                	<input name="txtNombre" type="text" id="txtNombre" disabled="disabled" value="${model.clienteSeleccionado.nombre}">
                </td>
                <td><span class="Estilo40">D.O.I : </span></td>
                <td>
                	<input name="txtDocumentoIdentidad" type="text" disabled="disabled" id="txtDocumentoIdentidad" value="${model.clienteSeleccionado.documentoIdentidad}">
                </td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo40">Apellido Paterno : </span></td>
                <td>
                	<input name="txtApellidoPaterno" type="text" disabled="disabled" id="txtApellidoPaterno" value="${model.clienteSeleccionado.apellidoPaterno}">
                </td>
                <td><span class="Estilo40">Apellido Materno : </span></td>
                <td>
                	<input name="txtApellidoPaterno" type="text" disabled="disabled" id="txtApellidoMaterno" value="${model.clienteSeleccionado.apellidoMaterno}">
                </td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo40">Dirección : </span></td>
                <td>
                	<input name="txtDireccion" type="text" disabled="disabled" id="txtDireccion" value="${model.clienteSeleccionado.direccion}">
                </td>
                <td><span class="Estilo40">Teléfono : </span></td>
                <td>
                	<input name="txtTelefono" type="text" disabled="disabled" id="txtTelefono" value="${model.clienteSeleccionado.telefono}">
                </td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"><img src="img/bullet1.gif" width="9" height="12"></span></th>
                <td><span class="Estilo48">Datos de Pago </span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
              </tr>
              <tr>
                <th scope="row">&nbsp;</th>
                <td><span class="Estilo40">Tipo de Pago:</span></td>
                <td><span class="Estilo27">
                  <label></label>
                  <input name="txtTipoPago" type="text" id="txtTipoPago">
                </span></td>
                <td><span class="Estilo40">Fecha Vencimiento: </span></td>
                <td><span class="Estilo27">
                  <input name="txtFechaPago" type="text" id="txtFechaPago">
                </span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo40">Descuento: </span></td>
                <td><span class="Estilo27">
                  <label></label>
                  <input name="txtDescuento" type="text" id="txtDescuento">
                </span></td>
                <td><span class="Estilo40">Moneda: </span></td>
                <td><span class="Estilo27">
                  <input name="txtMoneda" type="text" id="txtMoneda">
                </span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"><img src="img/bullet1.gif" width="9" height="12"></span></th>
                <td><span class="Estilo48">Lista de Productos </span></td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td align="right"><span class="Estilo27">
                  <input name="btnAgregarProductos" type="submit" id="btnAgregarProductos" value="Agregar Productos">
                </span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td colspan="4" rowspan="5"><table width="100%" border="1">
                    <tr>
                      <th width="6%" bgcolor="#CC0000" class="Estilo27" scope="row"><span class="Estilo52">N°</span></th>
                      <td width="36%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo52">Descripcion</span></td>
                      <td width="16%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo52">Tipo </span></td>
                      <td width="9%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo52">Cantidad</span></td>
                      <td width="13%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo52">P.U.</span></td>
                      <td width="10%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo52">Total</span></td>
                    </tr>
                    
                    <c:forEach items="${model.productosSeleccionados}" var="producto">
	                    <tr>
	                      <th class="Estilo27" scope="row">${producto.codigo}</th>
	                      <td class="Estilo27">${producto.descripcion}</td>
	                      <td class="Estilo27">${producto.tipo}</td>
	                      <td class="Estilo27">
	                      	<input name="cantidad${producto.codigo}" disabled="disabled" id="cantidad${producto.codigo}" type="text" size="3" value="${producto.cantidad}">
	                      </td>
	                      <td class="Estilo27">${producto.precio}</td>
	                      <td class="Estilo27">${producto.total}</td>
	                    </tr>                    	
                    </c:forEach>
                </table></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo48">Sub Total:</span></td>
                <td align="right"><span class="Estilo27">
                  <input name="txtSubTotal" type="text" disabled="disabled" id="txtSubTotal">
                </span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo48">I.G.V.</span></td>
                <td align="right"><span class="Estilo27">
                  <input name="txtIGV" type="text" disabled="disabled" id="txtIGV">
                </span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo48">Total:</span></td>
                <td align="right"><span class="Estilo27">
                  <input name="txtTotal" type="text" disabled="disabled" id="txtTotal">
                </span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
              </tr>
              <tr>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span><a href="javascript:atras();"><img src="img/flechaAtras.jpg" width="45" height="34" border="0"></a></td>
                <td colspan="2" align="center"><span class="Estilo27"></span><a href="index.jsp"><img src="img/cancelar.jpg" width="37" height="37" border="0"></a></td>
                <td align="right"><a href="javascript:finalizar();"><img src="img/guardar.jpg" width="41" height="39" border="0"></a></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><span class="Estilo56">Retroceder</span></td>
                <td colspan="2" align="center"><span class="Estilo27 Estilo54 Estilo57"><strong>Cancelar</strong></span></td>
                <td align="right"><span class="Estilo27 Estilo54 Estilo57"><strong>Guardar: </strong></span></td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td align="right">&nbsp;</td>
              </tr>
              <tr>
                <th scope="row"><span class="Estilo27"></span></th>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
                <td><span class="Estilo27"></span></td>
              </tr>
            </table></td>
          </tr>
      </table></td>
	</tr>
</table>
</td>
</tr>
</table>
</form>
</body>
</html>