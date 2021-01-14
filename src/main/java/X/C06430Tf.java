package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Tf  reason: invalid class name and case insensitive filesystem */
public final class C06430Tf implements AbstractC06440Tg {
    public final int[] A00 = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    public final int[] A01 = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
    public final int[] A02 = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    public final int[] A03 = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    public final int[] A04 = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    public final int[] A05 = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    public static final ColorStateList A00(Context context, int i) {
        int A012 = C13540kQ.A01(context, R.attr.colorControlHighlight);
        int A002 = C13540kQ.A00(context, R.attr.colorButtonNormal);
        return new ColorStateList(new int[][]{C13540kQ.A02, C13540kQ.A05, C13540kQ.A04, C13540kQ.A03}, new int[]{A002, C004402b.A02(A012, i), C004402b.A02(A012, i), i});
    }

    public static final void A01(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (AnonymousClass0WQ.A03(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(C06340Sv.A00(i, mode));
    }

    public static final boolean A02(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
