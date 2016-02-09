package isc.apps.lobbyos.android;

import android.widget.Toast;

public class ToastActivity extends Activity {

/** Called when the activity is first created. */
@Override
public void onCreate() {

/** Notifications with Toasts */
// A leaping small Android dialog with a short message, which then automatically fades and disappears by itself again.

/** Set Message String here */
String ToastText = "";

/** Set Display Time (with Toast.LENGTH_SHORT or with Toast.LENGTH_LONG) */
Toast ToastMessage = Toast.makeText(this, ToastText, Toast.LENGTH_SHORT);

/** Show Toast */
ToastMessage.show();

/** DISABLED - Set Position (with Gravity.TOP, Gravity.BOTTOM, Gravity.CENTER, Gravity.LEFT or Gravity.RIGHT) */
// ToastMessage.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);

}
}
