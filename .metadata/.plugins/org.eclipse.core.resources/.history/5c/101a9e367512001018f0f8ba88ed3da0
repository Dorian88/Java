package com.dorian.productos;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControladorProductos
 */
@WebServlet("/ControladorProductos")
public class ControladorProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ModeloProductos modeloProductos;

	@Resource(name="jdbc/Productos")
	private javax.sql.DataSource miPool;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();

		try {

			modeloProductos = new ModeloProductos(miPool);

		}catch(Exception e){

			throw new ServletException(e);

		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//Leer el parámetro del formulario
		String elComando = request.getParameter("instruccion");
		
		//si no se envia el parámetro, listar productos
		if(elComando == null) {
			elComando = "listar";
		}
		
		//Redirigir el flujo al método adecuado
		switch(elComando) {
			
			case "listar":
				obtenerProductos(request, response);
				break;
			
			case "insertarBD":
				agregarProductos(request, response);
				break;
			
			case "cargar":
			try{
				
				cargaProductos(request, response);
				
			}catch (Exception e) {
				
				e.printStackTrace();
				
			}
			break;
			
			case "actualizarBD":
			try {
				
				actualizaProductos(request, response);
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
			case "eliminar":
			try {
				
				eliminarProducto(request, response);
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
				break;
			
			default:
				obtenerProductos(request, response);
		}
		
	}

	private void eliminarProducto(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		//Capturar el código del artículo
		String codArticulo = request.getParameter("CArticulo");
		
		//Borrar el producto de la BD
		modeloProductos.eliminarProducto(codArticulo);
		
		//Volver a la lista de productos
		obtenerProductos(request, response);
	}

	private void actualizaProductos(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		//Leer los datos que vienen del formulario actualizar
		String codArticulo = request.getParameter("CArt");
		String seccion = request.getParameter("seccion");
		String nombreArticulo = request.getParameter("NArt");
		String fecha = request.getParameter("fecha");
		String precio = request.getParameter("precio");
		String importado = request.getParameter("importado");
		String paisOrigen = request.getParameter("POrig");
		
		//Crear un objeto de tipo producto con la informacion del formulario
		Productos productoActualizado = new Productos(codArticulo, seccion, nombreArticulo, precio, fecha, importado, paisOrigen);
		
		// Actualizar la BD con la informacion del objeto producto
		modeloProductos.actualizarProducto(productoActualizado);
		
		//Volver al listadocon la informacion actualizada
		obtenerProductos(request, response);
	}

	private void cargaProductos(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		//Leer el código articulo que viene del listado
		String codigoArticulo = request.getParameter("CArticulo");
		
		//Enviar el código artículo al modelo
		Productos elProducto = modeloProductos.getProducto(codigoArticulo);
		
		//Colocar el atributo correspondiente al código articulo
		request.setAttribute("ProductoActualizar", elProducto);
		
		//Enviar producto al formulario de actualizar
		RequestDispatcher dispatcher = request.getRequestDispatcher("/actualizarProducto.jsp");
		dispatcher.forward(request, response);
	}

	private void agregarProductos(HttpServletRequest request, HttpServletResponse response) {
		
		//Leer la informacion del producto que viene del formulario.
		String codArticulo = request.getParameter("CArt");
		String seccion = request.getParameter("seccion");
		String nombreArticulo = request.getParameter("NArt");
		String fecha = request.getParameter("fecha");
		String precio = request.getParameter("precio");
		String importado = request.getParameter("importado");
		String paisOrigen = request.getParameter("POrig");
		
		//Crear un objeto del tipo Producto
		Productos nuevoProducto = new Productos(codArticulo, seccion, nombreArticulo, precio, fecha, importado, paisOrigen);
		
		//Enviar el objeto al modelo y después insertar el objeto Producto en la BD
		try {
			
			modeloProductos.agregarElNuevoProducto(nuevoProducto);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}
		
		//Volver al listado de Productos
		obtenerProductos(request, response);
		
		/* Date fecha = null;
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
		try {
			fecha = formatoFecha.parse(request.getParameter("fecha"));
		} catch (ParseException e) {
			
			e.printStackTrace();
			
		}
		
		double precio = Double.parseDouble(request.getParameter("precio"));*/
		
	}

	private void obtenerProductos(HttpServletRequest request, HttpServletResponse response) {
		
		//Obtener la lista de productos desde el modelo
		List<Productos> productos;

		try {

			productos = modeloProductos.getProductos();

			//Agregar lista de productos al request
			request.setAttribute("LISTAPRODUCTOS", productos);

			//Enviar el request a la página JSP
			RequestDispatcher miDispatcher = request.getRequestDispatcher("/ListaProductos.jsp");
			miDispatcher.forward(request, response);

		}catch(Exception e) {

			e.printStackTrace();

		}
		
	}

}
