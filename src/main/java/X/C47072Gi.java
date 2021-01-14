package X;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.SharedFilePreviewDialogFragment;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2Gi  reason: invalid class name and case insensitive filesystem */
public class C47072Gi extends LinearLayout {
    public FrameLayout A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public LinearLayout A04;
    public SharedFilePreviewDialogFragment A05;
    public final AnonymousClass03P A06 = AnonymousClass03P.A00();
    public final AnonymousClass01X A07 = AnonymousClass01X.A00();
    public final AnonymousClass00T A08 = C002101e.A00();

    public C47072Gi(Context context) {
        super(context);
    }

    public void A00(SharedFilePreviewDialogFragment sharedFilePreviewDialogFragment, File file, String str, Uri uri) {
        long j;
        int i;
        this.A05 = sharedFilePreviewDialogFragment;
        ActivityC004902h A0A = sharedFilePreviewDialogFragment.A0A();
        if (A0A != null) {
            A0A.getLayoutInflater().inflate(R.layout.file_data_view, (ViewGroup) this, true);
            this.A04 = (LinearLayout) findViewById(R.id.display);
            this.A00 = (FrameLayout) findViewById(R.id.image_frame_layout);
            this.A02 = (ImageView) findViewById(R.id.image);
            this.A03 = (ImageView) findViewById(R.id.overlay);
            this.A01 = (ImageView) findViewById(R.id.icon);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A04.setClipToOutline(true);
            }
            this.A03.setVisibility(8);
            onConfigurationChanged(getResources().getConfiguration());
            if (file != null) {
                j = file.length();
            } else {
                j = 0;
            }
            AnonymousClass01X r3 = this.A07;
            String A1Y = C002001d.A1Y(r3, j);
            String A052 = AnonymousClass0ZD.A05(this.A06, uri);
            String upperCase = C02220Bc.A01(str).toUpperCase(r3.A0I());
            if (upperCase.isEmpty()) {
                upperCase = r3.A06(R.string.unknown_document_type);
            }
            try {
                i = AnonymousClass0ZD.A00(str, file);
            } catch (AnonymousClass35V e) {
                Log.e("shareddocumentpreview/malformed document", e);
                i = 0;
            }
            String A062 = AnonymousClass0ZD.A06(r3, str, i);
            TextView textView = (TextView) findViewById(R.id.file_name);
            TextView textView2 = (TextView) findViewById(R.id.page_count);
            View findViewById = findViewById(R.id.bullet);
            TextView textView3 = (TextView) findViewById(R.id.file_type);
            C002301g.A03(textView);
            textView.setText(A052);
            ((TextView) findViewById(R.id.file_size)).setText(A1Y);
            boolean isEmpty = A062.isEmpty();
            if (!isEmpty) {
                textView2.setVisibility(0);
                textView2.setText(A062);
            } else {
                textView2.setVisibility(8);
            }
            boolean isEmpty2 = upperCase.isEmpty();
            if (!isEmpty2) {
                textView3.setVisibility(0);
                textView3.setText(upperCase);
            } else {
                textView3.setVisibility(8);
            }
            if (isEmpty || isEmpty2) {
                findViewById.setVisibility(8);
            } else {
                findViewById.setVisibility(0);
            }
            findViewById.setContentDescription("");
            this.A08.ANC(new C51282Yc(file, str, this), new Void[0]);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ViewGroup.LayoutParams layoutParams = this.A04.getLayoutParams();
        if (layoutParams != null) {
            if (configuration.orientation == 1) {
                layoutParams.height = this.A05.A02().getDimensionPixelSize(R.dimen.file_preview_display_height);
            } else {
                layoutParams.height = -1;
            }
            this.A04.setLayoutParams(layoutParams);
        }
    }
}
