<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<title>Spring MVC</title>

<head>

<style type="text/css">
@import "http://o.aolcdn.com/dojo/1.2.0/dijit/themes/soria/soria.css";
</style>

<!-- load Dojo, and all the required modules -->
<script src="http://o.aolcdn.com/dojo/1.2/dojo/dojo.xd.js"></script>
<script type="text/javascript">

	dojo.addOnLoad(function() 
	{

		dojo.require("dijit.dijit"); // optimize: load dijit layer  
		dojo.require("dijit.form.Button");
		dojo.require("dijit.Dialog");

		// notice the second onLoad here:  
	});

	function showLoadingPopup()
	{
	  document.getElementById('loadingPopup').style.display = ""; 
	  dijit.byId('loadingPopupDialog').show();
	}
	
</script>
</head>

<div style="position: absolute; top: 100px; left: 200px; width: 350px;">
	<div dojotype="dijit.TitlePane" title="Login">
		<form>
			<button dojoType="dijit.form.Button" onclick="javascript:showLoadingPopup()">Show popup</button>
		</form>
	</div>
</div>

<!-- Popup de carga -->
<div id="loadingPopup" style="display: none;">
  <div dojoType="dijit.Dialog" id="loadingPopupDialog">
    <table cellpadding="0" cellspacing="0" border="0">
      <tbody>
        <tr>
          <td>
            <div>
              <center>
              	<p><img src='http://o.aolcdn.com/dojo/1.2/dojox/image/resources/images/loading.gif' />Cargando...
              </center>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</div>

</html>