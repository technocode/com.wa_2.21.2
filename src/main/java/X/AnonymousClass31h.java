package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperMockChatView;

/* renamed from: X.31h  reason: invalid class name */
public class AnonymousClass31h extends FrameLayout {
    public Resources A00;
    public Button A01;
    public FrameLayout A02;
    public ProgressBar A03;
    public WallpaperImagePreview A04;
    public WallpaperImagePreview A05;
    public WallpaperImagePreview A06;
    public WallpaperMockChatView A07;
    public final C002701k A08 = C002701k.A00();

    public AnonymousClass31h(Context context, String str, String str2, Resources resources) {
        super(context);
        this.A00 = resources;
        FrameLayout.inflate(context, R.layout.wallpaper_preview_chat_item_view, this);
        this.A05 = (WallpaperImagePreview) AnonymousClass0Q7.A0D(this, R.id.wallpaper_preview_background_doodle);
        this.A04 = (WallpaperImagePreview) AnonymousClass0Q7.A0D(this, R.id.wallpaper_preview_background);
        WallpaperImagePreview wallpaperImagePreview = (WallpaperImagePreview) AnonymousClass0Q7.A0D(this, R.id.wallpaper_preview_blur);
        this.A06 = wallpaperImagePreview;
        wallpaperImagePreview.setImageDrawable(null);
        WallpaperMockChatView wallpaperMockChatView = (WallpaperMockChatView) AnonymousClass0Q7.A0D(this, R.id.wallpaper_preview_mock_chat);
        this.A07 = wallpaperMockChatView;
        wallpaperMockChatView.setMessages(str, str2);
        this.A02 = (FrameLayout) AnonymousClass0Q7.A0D(this, R.id.wallpaper_preview_download_container);
        this.A03 = (ProgressBar) AnonymousClass0Q7.A0D(this, R.id.wallpaper_preview_progress_bar);
        this.A01 = (Button) AnonymousClass0Q7.A0D(this, R.id.wallpaper_preview_download_btn);
    }

    public void setBackgroundColor(int i) {
        this.A06.setVisibility(8);
        this.A04.setImageDrawable(null);
        this.A04.setBackgroundColor(i);
    }

    public void setDownloadClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    public void setWallpaper(Bitmap bitmap) {
        this.A06.setVisibility(8);
        this.A04.setImageBitmap(bitmap);
    }

    public void setWallpaper(Drawable drawable) {
        this.A06.setVisibility(8);
        this.A04.setImageDrawable(drawable);
    }
}
