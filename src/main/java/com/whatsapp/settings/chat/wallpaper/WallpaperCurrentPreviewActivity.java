package com.whatsapp.settings.chat.wallpaper;

import X.ActivityC004702f;
import X.AnonymousClass01A;
import X.AnonymousClass02J;
import X.AnonymousClass02N;
import X.AnonymousClass0HJ;
import X.AnonymousClass0L2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0S2;
import X.AnonymousClass0TX;
import X.AnonymousClass0YX;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass31V;
import X.AnonymousClass31X;
import X.C002001d;
import X.C002301g;
import X.C004302a;
import X.C007003k;
import X.C014308b;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0;

public class WallpaperCurrentPreviewActivity extends ActivityC004702f {
    public View A00;
    public SeekBar A01;
    public AnonymousClass0S2 A02;
    public AnonymousClass0HJ A03 = AnonymousClass0HJ.A02();
    public AnonymousClass01A A04 = AnonymousClass01A.A00();
    public C014308b A05 = C014308b.A00();
    public AnonymousClass0L2 A06 = AnonymousClass0L2.A01();
    public AnonymousClass02J A07 = AnonymousClass02J.A02();
    public AnonymousClass31V A08;
    public WallpaperImagePreview A09;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r0 != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(android.app.Activity r2, android.content.Intent r3, X.AnonymousClass31V r4, X.AnonymousClass01X r5) {
        /*
            X.02N r0 = X.AnonymousClass1VY.A08(r3)
            if (r0 == 0) goto L_0x001a
            if (r4 == 0) goto L_0x000f
            boolean r0 = r4.A03
            r1 = 2131890374(0x7f1210c6, float:1.9415438E38)
            if (r0 == 0) goto L_0x0012
        L_0x000f:
            r1 = 2131890372(0x7f1210c4, float:1.9415434E38)
        L_0x0012:
            java.lang.String r0 = r5.A06(r1)
            r2.setTitle(r0)
            return
        L_0x001a:
            boolean r0 = X.C002001d.A3E(r2)
            r1 = 2131890386(0x7f1210d2, float:1.9415462E38)
            if (r0 == 0) goto L_0x0012
            r1 = 2131890375(0x7f1210c7, float:1.941544E38)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity.A04(android.app.Activity, android.content.Intent, X.31V, X.01X):void");
    }

    public static void A05(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (((float) layoutParams.width) * f);
        layoutParams.height = (int) (((float) layoutParams.height) * f);
        view.setLayoutParams(layoutParams);
    }

    public final void A0R(AnonymousClass02N r4) {
        this.A08 = this.A07.A05(r4, this);
        A04(this, getIntent(), this.A08, ((AnonymousClass2C0) this).A01);
        Drawable A092 = this.A07.A09(this.A08);
        if (A092 != null) {
            this.A09.setImageDrawable(A092);
        }
        if (this.A01.getVisibility() == 0) {
            AnonymousClass31V r0 = this.A08;
            int i = 0;
            if (r0 != null) {
                Integer num = r0.A01;
                if (num != null) {
                    i = num.intValue();
                }
                this.A01.setProgress(i);
                return;
            }
            this.A01.setProgress(0);
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 199 && i2 == -1) {
            A0R(AnonymousClass1VY.A08(getIntent()));
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wallpaper_current_preview);
        A0C((Toolbar) AnonymousClass0TX.A0A(this, R.id.wallpaper_preview_toolbar));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            this.A02 = A092;
            A092.A0A(true);
            A04(this, getIntent(), this.A08, ((AnonymousClass2C0) this).A01);
            AnonymousClass0TX.A0A(this, R.id.change_current_wallpaper).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0(this, 15));
            this.A00 = AnonymousClass0TX.A0A(this, R.id.wallpaper_dimmer_container);
            C002301g.A03((TextView) AnonymousClass0TX.A0A(this, R.id.wallpaper_dimmer_title));
            this.A01 = (SeekBar) AnonymousClass0TX.A0A(this, R.id.wallpaper_dimmer_seekbar);
            Point A002 = AnonymousClass02J.A00(this);
            View A0A = AnonymousClass0TX.A0A(this, R.id.wallpaper_dimmer_container);
            A0A.measure(View.MeasureSpec.makeMeasureSpec(A002.x, 1073741824), View.MeasureSpec.makeMeasureSpec(A002.y, 0));
            View A0A2 = AnonymousClass0TX.A0A(this, R.id.change_current_wallpaper);
            A0A2.measure(View.MeasureSpec.makeMeasureSpec(A002.x, 1073741824), View.MeasureSpec.makeMeasureSpec(A002.y, 0));
            TextView textView = (TextView) AnonymousClass0TX.A0A(this, R.id.wallpaper_current_preview_theme_description);
            if (C002001d.A3E(this)) {
                textView.setText(R.string.wallpaper_preview_light_theme_description);
            } else {
                textView.setText(R.string.wallpaper_preview_dark_theme_description);
            }
            int[] iArr = {16843499};
            TypedArray obtainStyledAttributes = obtainStyledAttributes(new TypedValue().data, iArr);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            obtainStyledAttributes.recycle();
            float min = Math.min(0.56f, ((float) (((A002.y - A0A.getMeasuredHeight()) - A0A2.getMeasuredHeight()) - getResources().getDimensionPixelSize(R.dimen.wallpaper_preview_top_padding))) / ((float) (A002.y + dimensionPixelSize)));
            Point A003 = AnonymousClass02J.A00(this);
            int i = (int) (((float) A003.x) * min);
            int i2 = (int) (((float) A003.y) * min);
            ViewGroup.LayoutParams layoutParams = AnonymousClass0TX.A0A(this, R.id.wallpaper_preview_toolbar_container).getLayoutParams();
            int i3 = (int) (((float) layoutParams.height) * min);
            View A0A3 = AnonymousClass0TX.A0A(this, R.id.wallpaper_preview_toolbar_container);
            ViewGroup.LayoutParams layoutParams2 = A0A3.getLayoutParams();
            layoutParams2.height = i3;
            layoutParams2.width = i;
            A0A3.setLayoutParams(layoutParams2);
            View A0A4 = AnonymousClass0TX.A0A(this, R.id.current_wallpaper_preview_view_container);
            ViewGroup.LayoutParams layoutParams3 = A0A4.getLayoutParams();
            layoutParams3.height = i2;
            layoutParams3.width = i;
            A0A4.setLayoutParams(layoutParams3);
            int i4 = i2 + layoutParams.height;
            View A0A5 = AnonymousClass0TX.A0A(this, R.id.wallpaper_preview_outline_container);
            ViewGroup.LayoutParams layoutParams4 = A0A5.getLayoutParams();
            layoutParams4.height = i4;
            layoutParams4.width = i;
            A0A5.setLayoutParams(layoutParams4);
            View A0A6 = AnonymousClass0TX.A0A(this, R.id.change_current_wallpaper);
            ViewGroup.LayoutParams layoutParams5 = A0A6.getLayoutParams();
            layoutParams5.width = i;
            A0A6.setLayoutParams(layoutParams5);
            ViewOnClickCListenerShape10S0100000_I0 viewOnClickCListenerShape10S0100000_I0 = new ViewOnClickCListenerShape10S0100000_I0(this, 16);
            A0A6.setOnClickListener(viewOnClickCListenerShape10S0100000_I0);
            AnonymousClass0TX.A0A(this, R.id.current_wallpaper_preview_view_container).setOnClickListener(viewOnClickCListenerShape10S0100000_I0);
            ViewGroup viewGroup = (ViewGroup) AnonymousClass0TX.A0A(this, R.id.text_entry_layout);
            viewGroup.setFocusable(false);
            viewGroup.setDescendantFocusability(393216);
            AnonymousClass02N A082 = AnonymousClass1VY.A08(getIntent());
            this.A09 = (WallpaperImagePreview) AnonymousClass0TX.A0A(this, R.id.current_wallpaper_preview_view);
            if (A082 != null) {
                textView.setVisibility(4);
            } else {
                textView.setVisibility(0);
            }
            A0R(A082);
            ImageView imageView = (ImageView) AnonymousClass0TX.A0A(this, R.id.conversation_contact_photo);
            A05(imageView, min);
            A05(AnonymousClass0TX.A0A(this, R.id.send_container), min);
            A05(AnonymousClass0TX.A0A(this, R.id.voice_note_btn), min);
            A05(AnonymousClass0TX.A0A(this, R.id.emoji_picker_btn), min);
            A05(AnonymousClass0TX.A0A(this, R.id.input_attach_button), min);
            A05(AnonymousClass0TX.A0A(this, R.id.camera_btn), min);
            View A0A7 = AnonymousClass0TX.A0A(this, R.id.input_layout_content);
            ViewGroup.LayoutParams layoutParams6 = A0A7.getLayoutParams();
            layoutParams6.height = (int) (((float) layoutParams6.height) * min);
            A0A7.setLayoutParams(layoutParams6);
            WallpaperMockChatView wallpaperMockChatView = (WallpaperMockChatView) AnonymousClass0TX.A0A(this, R.id.wallpaper_preview_default_chat_view);
            wallpaperMockChatView.setMessages(getString(R.string.library_preview_chat_content_swipe_left), getString(R.string.library_preview_chat_content_swipe_right));
            wallpaperMockChatView.A00.setVisibility(4);
            wallpaperMockChatView.A03.setVisibility(4);
            wallpaperMockChatView.A03.setMinLines(1);
            wallpaperMockChatView.A03.setMaxLines(1);
            wallpaperMockChatView.A02.setMinEms(5);
            wallpaperMockChatView.A02.setText("");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wallpaperMockChatView.A02.getLayoutParams();
            marginLayoutParams.bottomMargin = wallpaperMockChatView.A04.getPaddingTop() + wallpaperMockChatView.A03.getPaddingBottom();
            wallpaperMockChatView.A02.setLayoutParams(marginLayoutParams);
            wallpaperMockChatView.A01.setVisibility(4);
            wallpaperMockChatView.A04.setVisibility(4);
            wallpaperMockChatView.A04.setMinLines(1);
            wallpaperMockChatView.A04.setMaxLines(1);
            TextView textView2 = wallpaperMockChatView.A03;
            textView2.setTextSize(0, (float) ((int) (textView2.getTextSize() * min)));
            TextView textView3 = wallpaperMockChatView.A02;
            textView3.setTextSize(0, (float) ((int) (textView3.getTextSize() * min)));
            TextView textView4 = wallpaperMockChatView.A04;
            textView4.setTextSize(0, (float) ((int) (textView4.getTextSize() * min)));
            TextView textView5 = (TextView) AnonymousClass0TX.A0A(this, R.id.conversation_contact_name);
            textView5.setTextSize(0, (float) ((int) (textView5.getTextSize() * min)));
            if (A082 == null) {
                textView5.setText(R.string.wallpaper_generic_contact_name);
                this.A03.A05(imageView, R.drawable.avatar_contact);
            } else {
                C007003k A0A8 = this.A04.A0A(A082);
                new AnonymousClass0YX(this.A06, (int) (((float) imageView.getResources().getDimensionPixelSize(R.dimen.small_avatar_size)) * min), -1.0f).A02(A0A8, imageView);
                textView5.setText(this.A05.A08(A0A8, false));
            }
            if (!C002001d.A3E(this)) {
                this.A00.setVisibility(8);
            } else {
                this.A00.setVisibility(0);
                Drawable A0b = C002001d.A0b(this, R.drawable.ic_dim, R.color.wallpaper_dimmer_seekbar);
                Drawable A032 = C004302a.A03(this, R.drawable.wallpaper_dimmer_seekbar_button_background);
                if (A032 != null) {
                    this.A01.setThumb(new LayerDrawable(new Drawable[]{A032, A0b}));
                    this.A01.setOnSeekBarChangeListener(new AnonymousClass31X(this));
                } else {
                    throw null;
                }
            }
            AnonymousClass0Q7.A0W(AnonymousClass0TX.A0A(this, R.id.conversation_contact_name), 2);
            AnonymousClass0Q7.A0W(AnonymousClass0TX.A0A(this, R.id.emoji_picker_btn), 2);
            AnonymousClass0Q7.A0W(AnonymousClass0TX.A0A(this, R.id.entry), 2);
            AnonymousClass0Q7.A0W(AnonymousClass0TX.A0A(this, R.id.input_attach_button), 2);
            AnonymousClass0Q7.A0W(AnonymousClass0TX.A0A(this, R.id.camera_btn), 2);
            AnonymousClass0Q7.A0W(AnonymousClass0TX.A0A(this, R.id.voice_note_btn), 2);
            AnonymousClass0Q7.A0W(((WallpaperMockChatView) AnonymousClass0TX.A0A(this, R.id.wallpaper_preview_default_chat_view)).A06, 2);
            return;
        }
        throw null;
    }
}
