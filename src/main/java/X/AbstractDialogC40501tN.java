package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;
import com.whatsapp.registration.EULA;
import com.whatsapp.util.Log;

/* renamed from: X.1tN  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractDialogC40501tN extends DialogC26681Ly {
    public int A00 = 0;
    public ProgressBar A01;
    public TextView A02;
    public GoogleDriveRestoreAnimationView A03;
    public final Activity A04;
    public final C02290Bk A05;
    public final C014508d A06;
    public final AnonymousClass0HM A07;

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public AbstractDialogC40501tN(Activity activity, AnonymousClass01X r4, C02290Bk r5, C014508d r6, AnonymousClass0HM r7) {
        super(activity, r4, R.layout.backup_restore, false);
        this.A05 = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A04 = activity;
    }

    public void A00(int i) {
        this.A00 = i;
        if (i == 1) {
            if (this.A03 == null) {
                this.A03 = (GoogleDriveRestoreAnimationView) findViewById(R.id.restore_animation_view);
            }
            findViewById(R.id.restore_actions_view).setVisibility(8);
            findViewById(R.id.restore_animation_view).setVisibility(0);
            this.A01 = (ProgressBar) findViewById(R.id.progress);
            this.A02 = (TextView) findViewById(R.id.progress_info);
            this.A01.setVisibility(0);
            this.A01.setIndeterminate(true);
            C28051Sr.A1V(this.A01, C004302a.A00(getContext(), R.color.media_message_progress_determinate));
            this.A02.setVisibility(0);
            this.A03.A00();
        } else if (i == 2) {
            GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A03;
            if (googleDriveRestoreAnimationView == null) {
                googleDriveRestoreAnimationView = (GoogleDriveRestoreAnimationView) findViewById(R.id.restore_animation_view);
                this.A03 = googleDriveRestoreAnimationView;
            }
            googleDriveRestoreAnimationView.A02(false);
            findViewById(R.id.restore_actions_view).setVisibility(8);
            ProgressBar progressBar = this.A01;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.A02;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = (TextView) findViewById(R.id.msgrestore_result_box);
            textView2.setVisibility(0);
            AnonymousClass01X r8 = super.A02;
            C014508d r2 = this.A06;
            String A0A = r8.A0A(R.plurals.gdrive_messages_restored_with_no_media_to_restore, (long) r2.A01(), Integer.valueOf(r2.A01()));
            StringBuilder sb = new StringBuilder("restorebackupdialog/after-msgstore-verified/ ");
            sb.append(A0A);
            Log.i(sb.toString());
            textView2.setText(A0A);
            findViewById(R.id.next_btn).setVisibility(0);
        }
    }

    @Override // X.DialogC26681Ly
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        findViewById(R.id.perform_restore).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 36));
        findViewById(R.id.dont_restore).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 34));
        findViewById(R.id.next_btn).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 35));
        if (bundle == null) {
            i = 0;
        } else {
            i = bundle.getInt("state");
        }
        A00(i);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(3);
            AnonymousClass01X r5 = super.A02;
            setTitle(r5.A06(R.string.activity_google_drive_title));
            Log.d("restorebackupdialog/lastbackup/look at files");
            long A08 = this.A05.A08();
            if (A08 != -1) {
                AnonymousClass008.A0z("restorebackupdialog/lastbackup/fromfiles/set to ", A08);
            }
            ((TextView) findViewById(R.id.restore_info)).setText(r5.A0D(R.string.local_restore_info_calculating, C002001d.A1F(r5, A08)));
            return;
        }
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A07.A0B();
        Activity activity = this.A04;
        activity.startActivity(EULA.A04(activity));
        return true;
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putInt("state", this.A00);
        return onSaveInstanceState;
    }
}
