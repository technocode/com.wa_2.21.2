package X;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatSpinner;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity;

/* renamed from: X.1Qn  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC27571Qn implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ GoogleDriveNewUserSetupActivity A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC27571Qn(GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity) {
        this.A00 = googleDriveNewUserSetupActivity;
    }

    public void onGlobalLayout() {
        int i;
        int measuredHeight;
        GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity = this.A00;
        int i2 = 0;
        int measuredHeight2 = ((ViewGroup) googleDriveNewUserSetupActivity.findViewById(R.id.scrollbars)).getChildAt(0).getMeasuredHeight();
        if (googleDriveNewUserSetupActivity.A04.getVisibility() == 0) {
            i = googleDriveNewUserSetupActivity.A04.getMeasuredHeight();
        } else {
            i = 0;
        }
        int i3 = measuredHeight2 - i;
        if (googleDriveNewUserSetupActivity.A03.getVisibility() == 0) {
            measuredHeight = 0;
        } else {
            measuredHeight = googleDriveNewUserSetupActivity.A03.getMeasuredHeight();
        }
        Point point = new Point();
        googleDriveNewUserSetupActivity.getWindowManager().getDefaultDisplay().getSize(point);
        int i4 = (((double) ((float) point.y)) > (((double) ((float) (i3 + measuredHeight))) * 0.7d) ? 1 : (((double) ((float) point.y)) == (((double) ((float) (i3 + measuredHeight))) * 0.7d) ? 0 : -1));
        boolean z = false;
        if (i4 < 0) {
            z = true;
        }
        AppCompatSpinner appCompatSpinner = googleDriveNewUserSetupActivity.A04;
        int i5 = 8;
        if (z) {
            i5 = 0;
        }
        appCompatSpinner.setVisibility(i5);
        RadioGroup radioGroup = googleDriveNewUserSetupActivity.A03;
        int i6 = 0;
        if (z) {
            i6 = 8;
        }
        radioGroup.setVisibility(i6);
        View findViewById = googleDriveNewUserSetupActivity.findViewById(R.id.gdrive_new_user_setup_select_frequency_message);
        if (z) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        googleDriveNewUserSetupActivity.A03.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
}
