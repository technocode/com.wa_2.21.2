package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.0kS  reason: invalid class name and case insensitive filesystem */
public class C13560kS {
    public final Context A00;
    public final Rect A01 = new Rect();
    public final View A02;
    public final WindowManager.LayoutParams A03 = new WindowManager.LayoutParams();
    public final TextView A04;
    public final int[] A05 = new int[2];
    public final int[] A06 = new int[2];

    public C13560kS(Context context) {
        this.A00 = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.A02 = inflate;
        this.A04 = (TextView) inflate.findViewById(R.id.message);
        this.A03.setTitle("TooltipPopup");
        this.A03.packageName = this.A00.getPackageName();
        WindowManager.LayoutParams layoutParams = this.A03;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131951627;
        layoutParams.flags = 24;
    }
}
