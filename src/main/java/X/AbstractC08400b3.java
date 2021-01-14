package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0b3  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC08400b3 extends AnonymousClass0YE {
    public final Context A00;
    public final Resources A01;

    public AbstractC08400b3(Context context) {
        this.A00 = context;
        this.A01 = null;
    }

    public AbstractC08400b3(Context context, Resources resources) {
        this.A00 = context;
        this.A01 = resources;
    }

    @Override // X.AnonymousClass0YE
    public Object A05(ViewGroup viewGroup, int i) {
        Context context;
        String string;
        String string2;
        Pair create;
        AnonymousClass01X r3;
        String A06;
        String A0T;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (this instanceof C08390b2) {
            C08390b2 r6 = (C08390b2) this;
            if (i == 0) {
                context = ((AbstractC08400b3) r6).A00;
                string = context.getString(R.string.library_preview_chat_content_swipe_left);
            } else {
                int A012 = r6.A01() - 1;
                context = ((AbstractC08400b3) r6).A00;
                if (i < A012) {
                    string = context.getString(R.string.wallpaper_preview_swipe_left_or_right);
                } else {
                    string = context.getString(R.string.library_preview_chat_content_swipe_right);
                }
            }
            if (r6.A00 == null) {
                if (C002001d.A3E(context)) {
                    string2 = context.getString(R.string.wallpaper_set_dark_wallpaper_bubble_message);
                } else {
                    string2 = context.getString(R.string.wallpaper_set_light_wallpaper_bubble_message);
                }
            } else if (r6.A08) {
                string2 = context.getString(R.string.wallpaper_set_without_custom_wallpaper_bubble_message);
            } else {
                string2 = context.getString(R.string.wallpaper_set_with_custom_wallpaper_bubble_message);
            }
            create = Pair.create(string, string2);
        } else if (!(this instanceof C08410b4)) {
            C08420b5 r62 = (C08420b5) this;
            SolidColorWallpaperPreview solidColorWallpaperPreview = r62.A02;
            C000300f r7 = ((ActivityC004702f) solidColorWallpaperPreview).A0G;
            C002801l r4 = AbstractC000400g.A2e;
            if (!r7.A0D(r4)) {
                r3 = ((AnonymousClass2C0) solidColorWallpaperPreview).A01;
                int A013 = r62.A01() - 1;
                int i2 = R.string.wallpaper_preview_chat_content_swipe_left;
                if (i == A013) {
                    i2 = R.string.wallpaper_preview_chat_content_swipe_right;
                }
                A06 = r3.A06(i2);
            } else if (i == 0) {
                r3 = ((AnonymousClass2C0) solidColorWallpaperPreview).A01;
                A06 = r3.A06(R.string.wallpaper_preview_chat_content_swipe_left);
            } else if (i < r62.A01() - 1) {
                r3 = ((AnonymousClass2C0) solidColorWallpaperPreview).A01;
                A06 = r3.A06(R.string.wallpaper_color_preview_swipe_left_or_right);
            } else {
                r3 = ((AnonymousClass2C0) solidColorWallpaperPreview).A01;
                A06 = r3.A06(R.string.wallpaper_preview_chat_content_swipe_right);
            }
            if (!r7.A0D(r4)) {
                int i3 = R.string.wallpaper_preview_chat_content_swipe_right;
                if (i == 0) {
                    i3 = R.string.wallpaper_preview_chat_content_swipe_left;
                }
                A0T = r3.A06(i3);
            } else {
                A0T = solidColorWallpaperPreview.A0T();
            }
            create = Pair.create(A06, A0T);
        } else {
            C08410b4 r63 = (C08410b4) this;
            WallpaperPreview wallpaperPreview = r63.A00;
            int A014 = r63.A01() - 1;
            int i4 = R.string.library_preview_chat_content_swipe_left;
            if (i == A014) {
                i4 = R.string.library_preview_chat_content_swipe_right;
            }
            String string3 = wallpaperPreview.getString(i4);
            int i5 = R.string.library_preview_chat_content_swipe_right;
            if (i == 0) {
                i5 = R.string.library_preview_chat_content_swipe_left;
            }
            create = Pair.create(string3, wallpaperPreview.getString(i5));
        }
        AnonymousClass31h r0 = new AnonymousClass31h(this.A00, (String) create.first, (String) create.second, this.A01);
        r0.setLayoutParams(layoutParams);
        viewGroup.addView(r0);
        if (this instanceof C08390b2) {
            C08390b2 r32 = (C08390b2) this;
            r0.setDownloadClickListener(new View$OnClickListenerC657931o(r32, r0, i));
            List list = r32.A04;
            if (i < list.size()) {
                r32.A0F(r0, i);
                return r0;
            }
            int size = i - list.size();
            C09860de r5 = new C09860de(r0.A08, r0.getContext(), r0.A06, r0.A04, r0.A00, ((Number) r32.A06.get(size)).intValue(), ((Number) r32.A05.get(size)).intValue());
            r0.A02.setVisibility(8);
            DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = r32.A02.A01;
            Set set = downloadableWallpaperPreviewActivity.A07;
            Integer valueOf = Integer.valueOf(i);
            set.add(valueOf);
            if (downloadableWallpaperPreviewActivity.A01.getCurrentItem() == i) {
                ((AnonymousClass1PO) downloadableWallpaperPreviewActivity).A00.setEnabled(true);
            }
            AnonymousClass0JW r1 = (AnonymousClass0JW) r32.A07.put(valueOf, r5);
            if (r1 != null) {
                r1.A00.cancel(true);
            }
            r32.A03.ANC(r5, new Void[0]);
            return r0;
        } else if (!(this instanceof C08410b4)) {
            C08420b5 r33 = (C08420b5) this;
            SolidColorWallpaperPreview solidColorWallpaperPreview2 = r33.A02;
            r0.setBackgroundColor(solidColorWallpaperPreview2.A0C[i]);
            if (((ActivityC004702f) solidColorWallpaperPreview2).A0G.A0D(AbstractC000400g.A2e)) {
                if (r33.A00) {
                    Context context2 = r0.getContext();
                    int i6 = context2.getResources().getIntArray(R.array.wallpaper_doodle_tint_colors)[i];
                    Drawable A03 = C004302a.A03(context2, R.drawable.whatsapp_doodle);
                    if (A03 != null) {
                        r0.A05.setImageDrawable(C002001d.A0e(A03, i6));
                    } else {
                        throw null;
                    }
                } else {
                    r0.A05.setImageDrawable(null);
                }
                Map map = r33.A01;
                Integer valueOf2 = Integer.valueOf(i);
                map.put(valueOf2, Boolean.valueOf(r33.A00));
                r0.setTag(valueOf2);
            }
            return r0;
        } else {
            WallpaperPreview wallpaperPreview2 = ((C08410b4) this).A00;
            C09860de r34 = new C09860de(r0.A08, r0.getContext(), r0.A06, r0.A04, r0.A00, ((Number) wallpaperPreview2.A0B.get(i)).intValue(), ((Number) wallpaperPreview2.A0A.get(i)).intValue());
            AnonymousClass0JW r12 = (AnonymousClass0JW) wallpaperPreview2.A0D.put(Integer.valueOf(i), r34);
            if (r12 != null) {
                r12.A00.cancel(true);
            }
            ((AnonymousClass0JW) r34).A00.execute(new Void[0]);
            return r0;
        }
    }
}
