package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallerypicker.MediaPreviewActivity;

/* renamed from: X.2eP  reason: invalid class name and case insensitive filesystem */
public class C54132eP {
    public float A00;
    public float A01;
    public Drawable A02;
    public Drawable A03;
    public Uri A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public ViewGroup A08;
    public ImageView A09;
    public TextView A0A;
    public boolean A0B;
    public final Handler A0C = new Handler(Looper.getMainLooper());
    public final Runnable A0D = new RunnableEBaseShape9S0100000_I1_4(this, 43);
    public final int[] A0E = new int[2];
    public final /* synthetic */ MediaPreviewActivity A0F;

    public C54132eP(MediaPreviewActivity mediaPreviewActivity, Activity activity) {
        this.A0F = mediaPreviewActivity;
        this.A03 = C004302a.A03(activity, R.drawable.ic_remove_white);
        this.A02 = C004302a.A03(activity, R.drawable.ic_remove_red);
        this.A08 = (ViewGroup) activity.findViewById(R.id.remove_frame);
        this.A0A = (TextView) activity.findViewById(R.id.drag_remove);
        this.A05 = activity.findViewById(R.id.drag_remove_padding);
        this.A07 = (ViewGroup) activity.findViewById(R.id.drag_frame);
        C59712oA r1 = new C59712oA(this, activity);
        this.A09 = r1;
        r1.setSelected(true);
        this.A09.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A07.addView(this.A09);
    }
}
