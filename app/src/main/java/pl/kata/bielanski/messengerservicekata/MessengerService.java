package pl.kata.bielanski.messengerservicekata;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.widget.Toast;


public class MessengerService extends Service {
	static final int MSG_SAY_HALLO = 1;

	class IncommingHandler extends Handler {

		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
				case MSG_SAY_HALLO:
					Toast.makeText(getApplicationContext(), "hello!", Toast.LENGTH_LONG).show();
					break;
				default:
					super.handleMessage(msg);
			}
		}
	}

	final Messenger mMessenger = new Messenger(new IncommingHandler());

	@Override
	public IBinder onBind(Intent intent) {
		Toast.makeText(getApplicationContext(), "Service bound", Toast.LENGTH_LONG).show();
		return mMessenger.getBinder();
	}
}
