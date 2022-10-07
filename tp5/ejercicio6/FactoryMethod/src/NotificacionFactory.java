
public class NotificacionFactory {

	// Este te decide qué notificacion creo, una por sms, por push o por e mail.Esta
	// clase es la fabrica que crea un objeto de alguna de las otras clases.
	public Notificacion createNotification(String metodo)

	{
		if (metodo == null || metodo.isEmpty())
			return null;
		if ("SMS".equals(metodo)) {
			return new SMSNotificacion();
		} else if ("EMAIL".equals(metodo)) {
			return new EmailNotificacion();
		} else if ("PUSH".equals(metodo)) {
			return new PushNotificacion();
		}
		return null;
	}
}
