
public class Main {

	public static void main(String[] args) {
		NotificacionFactory nf = new NotificacionFactory();
		//Genero una notificacion con la fabrica, algo abstracto, no instancio solo una clase sms o push o e mail; sino que instancio algo abstracto que es una notifiacion, que en lo especializado es sms o push o e mail;
		Notificacion n = nf.createNotification("SMS"); //la fabrica nF, me retorna siempre un mismo tipo; Notifiacion. De manera que no importa cuales de las 3 clases haya instanciado, porque las 3 son notificaciones. Así que la clase fabrica instancia una u otra clase, siempre la puedo tratar como que me fabricó una NOTIFICACION, no una notificacion push o sms o e mail, sino que en lo más abstracto y general, lo que está haciendo es generar una notificacion
		
		n.notificarUsuario(); // no importa qué clase notificacion haya instanciado, todas ellas son del tipo Notificacion, por eso podemos hacer n.notificarUsuario() siempre sin importar qué instanciemos

	}

}
