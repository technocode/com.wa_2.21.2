package X;

import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.3RX  reason: invalid class name */
public class AnonymousClass3RX extends AbstractC11910hD {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final AnonymousClass01X A05 = AnonymousClass01X.A00();
    public final AnonymousClass00Y A06 = AnonymousClass00Y.A00();
    public final StorageUsageMediaPreviewView A07;
    public final StorageUsageMediaPreviewView A08;

    public AnonymousClass3RX(View view) {
        super(view);
        this.A00 = AnonymousClass0Q7.A0D(view, R.id.forwarded_files_container);
        this.A02 = (TextView) AnonymousClass0Q7.A0D(view, R.id.forwarded_files_size_text_view);
        this.A07 = (StorageUsageMediaPreviewView) AnonymousClass0Q7.A0D(view, R.id.forwarded_files_preview_view);
        this.A01 = AnonymousClass0Q7.A0D(view, R.id.large_files_container);
        this.A04 = (TextView) AnonymousClass0Q7.A0D(view, R.id.large_files_title_text_view);
        this.A03 = (TextView) AnonymousClass0Q7.A0D(view, R.id.large_files_size_text_view);
        this.A08 = (StorageUsageMediaPreviewView) AnonymousClass0Q7.A0D(view, R.id.large_files_preview_view);
        AnonymousClass0Q7.A0d(this.A00, new C41111uU());
        AnonymousClass0Q7.A0d(this.A01, new C41111uU());
    }
}
