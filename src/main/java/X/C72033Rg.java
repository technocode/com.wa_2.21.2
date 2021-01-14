package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.SegmentedProgressBar;
import com.whatsapp.storage.SizeTickerView;

/* renamed from: X.3Rg  reason: invalid class name and case insensitive filesystem */
public class C72033Rg extends AbstractC11910hD {
    public long A00;
    public long A01;
    public AnimatorSet A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final View A07;
    public final AnonymousClass009 A08 = AnonymousClass009.A00();
    public final WaImageView A09;
    public final WaTextView A0A;
    public final WaTextView A0B;
    public final WaTextView A0C;
    public final WaTextView A0D;
    public final SegmentedProgressBar A0E;
    public final AnonymousClass01X A0F;
    public final SizeTickerView A0G;
    public final SizeTickerView A0H;
    public final int[] A0I;

    public C72033Rg(View view) {
        super(view);
        AnonymousClass02M.A00();
        C002101e.A00();
        this.A0F = AnonymousClass01X.A00();
        AnonymousClass00C.A00();
        SizeTickerView sizeTickerView = (SizeTickerView) AnonymousClass0Q7.A0D(view, R.id.used_space_text);
        this.A0H = sizeTickerView;
        View view2 = super.A0H;
        sizeTickerView.A02(0, C004302a.A00(view2.getContext(), R.color.settings_accented_text), false);
        this.A0D = (WaTextView) AnonymousClass0Q7.A0D(view, R.id.used_space_description_text);
        SizeTickerView sizeTickerView2 = (SizeTickerView) AnonymousClass0Q7.A0D(view, R.id.free_space_text);
        this.A0G = sizeTickerView2;
        sizeTickerView2.A02(0, C004302a.A00(view2.getContext(), R.color.storage_usage_gray), false);
        this.A09 = (WaImageView) AnonymousClass0Q7.A0D(view, R.id.free_space_critical_icon);
        this.A0A = (WaTextView) AnonymousClass0Q7.A0D(view, R.id.free_space_description_text);
        this.A0E = (SegmentedProgressBar) AnonymousClass0Q7.A0D(view, R.id.progress_bar);
        this.A07 = AnonymousClass0Q7.A0D(view, R.id.progress_bar_legend_container);
        this.A0B = (WaTextView) AnonymousClass0Q7.A0D(view, R.id.media_description_text);
        this.A0C = (WaTextView) AnonymousClass0Q7.A0D(view, R.id.other_description_text);
        Context context = view.getContext();
        int[] iArr = new int[2];
        this.A0I = iArr;
        iArr[0] = C004302a.A00(context, R.color.settings_accented_text);
        this.A0I[1] = C004302a.A00(context, R.color.paletteHighlight);
        this.A05 = C004302a.A00(context, R.color.settings_item_subtitle_text);
        this.A04 = C004302a.A00(context, R.color.storage_usage_red);
        this.A06 = C004302a.A00(context, R.color.storage_usage_progress_bar_background_color);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.storage_usage_summary_circle_size);
        Drawable A032 = C004302a.A03(context, R.drawable.storage_usage_green_circle);
        A032.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        this.A0B.setCompoundDrawables(A032, null, null, null);
        Drawable A033 = C004302a.A03(context, R.drawable.storage_usage_yellow_circle);
        A033.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        this.A0C.setCompoundDrawables(A033, null, null, null);
    }
}
