package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity;

/* renamed from: X.1Qo  reason: invalid class name and case insensitive filesystem */
public class C27581Qo implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ GoogleDriveNewUserSetupActivity A00;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    public C27581Qo(GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity) {
        this.A00 = googleDriveNewUserSetupActivity;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity = this.A00;
        if (googleDriveNewUserSetupActivity.A04.getVisibility() == 0) {
            googleDriveNewUserSetupActivity.A0g(String.valueOf(adapterView.getItemAtPosition(i)), null);
        }
    }
}
