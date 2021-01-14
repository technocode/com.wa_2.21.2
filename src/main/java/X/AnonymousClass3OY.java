package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape2S0101000_I1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3OY  reason: invalid class name */
public class AnonymousClass3OY extends AbstractC16300pa {
    public final ContentResolver A00;
    public final Handler A01;
    public final AnonymousClass009 A02;
    public final C000300f A03;
    public final AnonymousClass08D A04;
    public final AnonymousClass00G A05;
    public final AnonymousClass03S A06;
    public final AnonymousClass01X A07;
    public final C002701k A08;
    public final AnonymousClass0XO A09;
    public final AnonymousClass3OV A0A;
    public final AnonymousClass3OX A0B;
    public final C007703s A0C;
    public final AnonymousClass00T A0D;
    public final List A0E;
    public final Map A0F;

    public AnonymousClass3OY(AnonymousClass01X r3, List list, AnonymousClass3OV r5, Handler handler, ContentResolver contentResolver, AnonymousClass08D r8, C002701k r9, AnonymousClass009 r10, AnonymousClass00G r11, AnonymousClass00T r12, C000300f r13, AnonymousClass0XO r14, AnonymousClass03S r15, C007703s r16) {
        HashMap hashMap = new HashMap();
        this.A0F = hashMap;
        this.A0B = new AnonymousClass3OX(hashMap);
        this.A07 = r3;
        this.A0E = list;
        this.A0A = r5;
        this.A01 = handler;
        this.A00 = contentResolver;
        this.A04 = r8;
        this.A08 = r9;
        this.A02 = r10;
        this.A05 = r11;
        this.A0D = r12;
        this.A03 = r13;
        this.A09 = r14;
        this.A06 = r15;
        this.A0C = r16;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A0E.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        if (i == 5) {
            return new C74023Zx(LayoutInflater.from(context).inflate(R.layout.wallpaper_category_use_default_wallpaper, (ViewGroup) null), this.A0B);
        } else if (i == 4) {
            return new C74013Zw(LayoutInflater.from(context).inflate(R.layout.wallpaper_category_remove_custom_wallpaper, (ViewGroup) null), this.A0B);
        } else if (i == 3) {
            Handler handler = this.A01;
            ContentResolver contentResolver = this.A00;
            AnonymousClass08D r0 = this.A04;
            return new C74003Zv(new AnonymousClass31W(context), new AnonymousClass2PM(r0, contentResolver, handler), this.A08, this.A02, this.A05, this.A0D, this.A03, this.A09, this.A06, this.A0C, this.A0B);
        } else {
            return new C74033Zy(this.A07, new AnonymousClass31W(context), this.A0B);
        }
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r13, int i) {
        String A062;
        GradientDrawable gradientDrawable;
        ImageView.ScaleType scaleType;
        AnonymousClass0JW r2;
        AnonymousClass3OZ r132 = (AnonymousClass3OZ) r13;
        r132.A0H.setOnClickListener(new ViewOnClickCListenerShape2S0101000_I1(this, i, 5));
        Integer num = (Integer) this.A0E.get(i);
        if (r132 instanceof C74033Zy) {
            C74033Zy r5 = (C74033Zy) r132;
            Context context = r5.A0H.getContext();
            int intValue = num.intValue();
            Drawable drawable = null;
            if (intValue == 0) {
                A062 = r5.A00.A06(R.string.wallpaper_categories_bright);
                Drawable A032 = C004302a.A03(context, R.drawable.ic_wallpaper_thumb_bright);
                gradientDrawable = A032;
                if (A032 == null) {
                    throw null;
                }
            } else if (intValue == 1) {
                A062 = r5.A00.A06(R.string.wallpaper_categories_dark);
                Drawable A033 = C004302a.A03(context, R.drawable.ic_wallpaper_thumb_dark);
                gradientDrawable = A033;
                if (A033 == null) {
                    throw null;
                }
            } else if (intValue == 2) {
                A062 = r5.A00.A06(R.string.solid_color_wallpaper);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setSize(1, 1);
                gradientDrawable2.setColor(C004302a.A00(context, R.color.wallpaper_color_scandal_green));
                int A002 = C004302a.A00(context, R.color.wallpaper_doodle_tint_color_scandal_green);
                Drawable A034 = C004302a.A03(context, R.drawable.whatsapp_doodle);
                if (A034 != null) {
                    gradientDrawable = new LayerDrawable(new Drawable[]{gradientDrawable2, C002001d.A0e(A034, A002)});
                } else {
                    throw null;
                }
            } else if (intValue == 3) {
                A062 = r5.A00.A06(R.string.wallpaper_categories_my_photos);
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setSize(1, 1);
                gradientDrawable3.setColor(C004302a.A00(context, R.color.btn_gray_normal));
                drawable = C002001d.A0b(context, R.drawable.ic_attachment_gallery, R.color.white);
                gradientDrawable = gradientDrawable3;
            } else {
                StringBuilder sb = new StringBuilder("Unknown categoryType: ");
                sb.append(num);
                throw new RuntimeException(sb.toString());
            }
            AnonymousClass31W r1 = r5.A01;
            r1.A00(A062, gradientDrawable, drawable);
            if (intValue == 2) {
                scaleType = ImageView.ScaleType.CENTER;
            } else {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            }
            r1.setPreviewScaleType(scaleType);
        } else if (r132 instanceof C74003Zv) {
            C74003Zv r22 = (C74003Zv) r132;
            Context context2 = r22.A0H.getContext();
            String string = context2.getString(R.string.wallpaper_categories_my_photos);
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setSize(1, 1);
            gradientDrawable4.setColor(C004302a.A00(context2, R.color.wallpaper_category_my_photos_background));
            r22.A09.A00(string, gradientDrawable4, C002001d.A0b(context2, R.drawable.ic_attachment_gallery, R.color.wallpaper_category_my_photos_placeholder_tint));
            if (!r22.A01 && r22.A00 == null) {
                C10450ee r4 = new C10450ee(new C71213Oa(r22, string), r22.A04, r22.A02, r22.A03, r22.A08, r22.A05, r22.A0A);
                r22.A00 = r4;
                r22.A0B.ANC(r4, new Object[0]);
            }
        }
        if (!(r132 instanceof C74003Zv)) {
            r2 = null;
        } else {
            r2 = ((C74003Zv) r132).A00;
        }
        if (r2 != null) {
            this.A0F.put(Integer.valueOf(i), r2);
        }
    }
}
