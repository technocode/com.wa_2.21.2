package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.ContactStatusThumbnail;
import com.whatsapp.SelectionCheckView;
import com.whatsapp.status.playback.MyStatusesActivity;

/* renamed from: X.32M  reason: invalid class name */
public class AnonymousClass32M {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final ProgressBar A04;
    public final TextView A05;
    public final TextView A06;
    public final ContactStatusThumbnail A07;
    public final SelectionCheckView A08;
    public final /* synthetic */ MyStatusesActivity A09;

    public AnonymousClass32M(MyStatusesActivity myStatusesActivity, View view) {
        this.A09 = myStatusesActivity;
        this.A00 = view;
        ContactStatusThumbnail contactStatusThumbnail = (ContactStatusThumbnail) view.findViewById(R.id.contact_photo);
        this.A07 = contactStatusThumbnail;
        contactStatusThumbnail.setClickable(false);
        View findViewById = view.findViewById(R.id.contact_selector);
        this.A01 = findViewById;
        findViewById.setClickable(false);
        this.A05 = (TextView) view.findViewById(R.id.date_time);
        ImageView imageView = (ImageView) view.findViewById(R.id.overflow_icon);
        this.A03 = imageView;
        imageView.setOnClickListener(myStatusesActivity.A0B);
        this.A06 = (TextView) view.findViewById(R.id.views_count);
        View findViewById2 = view.findViewById(R.id.retry_button);
        this.A02 = findViewById2;
        findViewById2.setOnClickListener(myStatusesActivity.A0C);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress);
        this.A04 = progressBar;
        C28051Sr.A1V(progressBar, C004302a.A00(view.getContext(), R.color.primary_light));
        this.A08 = (SelectionCheckView) view.findViewById(R.id.selection_check);
        C002301g.A03(this.A06);
    }
}
