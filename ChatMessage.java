import java.io.*;
/*
* Questa classe definisce il diverso tipo di messaggi che verranno scambiati tra
* Client e server.
 */

public class ChatMessage implements Serializable {

	// I diversi tipi di messaggi inviati dal Cliente
	// WHOISIN per ricevere l'elenco degli utenti connessi
	// MESSAGGIO un normale messaggio di testo
	// LOGOUT per disconnettersi dal server
	static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2;
	private int type;
	private String message;
	
	// constructor
	ChatMessage(int type, String message) {
		this.type = type;
		this.message = message;
	}
	
	int getType() {
		return type;
	}

	String getMessage() {
		return message;
	}
}