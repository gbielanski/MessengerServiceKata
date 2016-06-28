package pl.kata.bielanski.messengerservicekata;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;


public class MessengerService extends Service {
	public MessengerService() {
	}

	class IncommingHandler extends Handler {

	}

	@Override
	public IBinder onBind(Intent intent) {
		throw new UnsupportedOperationException("Not yet implemented");
	}
}
