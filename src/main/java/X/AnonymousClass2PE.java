package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: X.2PE  reason: invalid class name */
public class AnonymousClass2PE {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Context A04;
    public Uri A05;
    public Bundle A06;
    public String A07;
    public String A08;
    public ArrayList A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public AnonymousClass2PE(Context context) {
        this.A04 = context;
    }

    public Intent A00() {
        Intent intent = new Intent(this.A04, MediaPreviewActivity.class);
        intent.putExtra("android.intent.extra.STREAM", this.A09);
        intent.putExtra("android.intent.extra.TEXT", (String) null);
        intent.putExtra("jid", this.A07);
        intent.putExtra("jids", (Serializable) null);
        intent.putExtra("max_items", this.A00);
        intent.putExtra("origin", this.A01);
        intent.putExtra("picker_open_time", this.A02);
        intent.putExtra("send", this.A0C);
        intent.putExtra("quoted_message_row_id", this.A03);
        intent.putExtra("quoted_group_jid", this.A08);
        intent.putExtra("number_from_url", this.A0A);
        intent.putExtra("media_preview_params", this.A06);
        intent.putExtra("smb_quick_reply", false);
        intent.putExtra("start_home", false);
        intent.putExtra("animate_uri", this.A05);
        intent.putExtra("preselected_image_uri", (Parcelable) null);
        intent.putExtra("scan_for_qr", this.A0B);
        return intent;
    }
}
