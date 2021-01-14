package X;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.SingleSelectionDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperSetConfirmationDialogFragment;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.Serializable;

/* renamed from: X.1PO  reason: invalid class name */
public abstract class AnonymousClass1PO extends AnonymousClass1U5 implements AnonymousClass0SB {
    public Button A00;
    public final AnonymousClass01A A01 = AnonymousClass01A.A00();
    public final C014308b A02 = C014308b.A00();

    public String A0T() {
        if (((AnonymousClass1U5) this).A00 == null) {
            if (C002001d.A3E(this)) {
                return getString(R.string.wallpaper_set_dark_wallpaper_bubble_message);
            }
            return getString(R.string.wallpaper_set_light_wallpaper_bubble_message);
        } else if (((AnonymousClass1U5) this).A01) {
            return getString(R.string.wallpaper_set_without_custom_wallpaper_bubble_message);
        } else {
            return getString(R.string.wallpaper_set_with_custom_wallpaper_bubble_message);
        }
    }

    public void A0U(AnonymousClass02N r14) {
        if (this instanceof DownloadableWallpaperPreviewActivity) {
            DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = (DownloadableWallpaperPreviewActivity) this;
            Intent intent = new Intent();
            int currentItem = downloadableWallpaperPreviewActivity.A01.getCurrentItem();
            if (currentItem < downloadableWallpaperPreviewActivity.A04.size()) {
                Uri uri = (Uri) downloadableWallpaperPreviewActivity.A04.get(downloadableWallpaperPreviewActivity.A01.getCurrentItem());
                AnonymousClass0PA r4 = downloadableWallpaperPreviewActivity.A08;
                if (r4 != null) {
                    String path = uri.getPath();
                    if (path != null) {
                        File A012 = r4.A05.A01(new File(path).getName().split("\\.")[0]);
                        if (A012 != null) {
                            intent.setData(Uri.fromFile(A012));
                            intent.putExtra("FROM_INTERNAL_DOWNLOADS_KEY", true);
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                intent.putExtra("selected_res_id", (Serializable) downloadableWallpaperPreviewActivity.A05.get(currentItem - downloadableWallpaperPreviewActivity.A04.size()));
            }
            intent.putExtra("chat_jid", r14);
            downloadableWallpaperPreviewActivity.setResult(-1, intent);
            downloadableWallpaperPreviewActivity.finish();
        } else if (this instanceof WallpaperPreview) {
            WallpaperPreview wallpaperPreview = (WallpaperPreview) this;
            Intent intent2 = new Intent();
            intent2.putExtra("selected_res_id", (Serializable) wallpaperPreview.A0A.get(wallpaperPreview.A09.getCurrentItem()));
            intent2.putExtra("chat_jid", r14);
            wallpaperPreview.setResult(-1, intent2);
            wallpaperPreview.finish();
        } else if (this instanceof SolidColorWallpaperPreview) {
            SolidColorWallpaperPreview solidColorWallpaperPreview = (SolidColorWallpaperPreview) this;
            Intent intent3 = new Intent();
            intent3.putExtra("wallpaper_color_file", solidColorWallpaperPreview.A0D[solidColorWallpaperPreview.A09.getCurrentItem()]);
            if (((ActivityC004702f) solidColorWallpaperPreview).A0G.A0D(AbstractC000400g.A2e)) {
                intent3.putExtra("wallpaper_doodle_overlay", solidColorWallpaperPreview.A08.isChecked());
            }
            intent3.putExtra("chat_jid", r14);
            solidColorWallpaperPreview.setResult(-1, intent3);
            solidColorWallpaperPreview.finish();
        } else if (!(this instanceof GalleryWallpaperPreview)) {
            Intent intent4 = new Intent();
            intent4.putExtra("chat_jid", r14);
            intent4.putExtra("is_default", true);
            setResult(-1, intent4);
            finish();
        } else {
            GalleryWallpaperPreview galleryWallpaperPreview = (GalleryWallpaperPreview) this;
            Uri uri2 = galleryWallpaperPreview.A01;
            if (uri2 == null) {
                Log.i("gallerywallpaperpreview/no uri found to save to. generating our own");
                uri2 = galleryWallpaperPreview.A08.A04();
                galleryWallpaperPreview.A01 = uri2;
            }
            File file = new File(uri2.getPath());
            Bitmap fullViewCroppedBitmap = galleryWallpaperPreview.A02.getFullViewCroppedBitmap();
            if (fullViewCroppedBitmap != null) {
                int i = 90;
                OutputStream outputStream = null;
                do {
                    try {
                        ContentResolver A06 = galleryWallpaperPreview.A05.A06();
                        if (A06 == null) {
                            Log.w("gallerywallpaperpreview/save cr=null");
                        } else {
                            outputStream = A06.openOutputStream(galleryWallpaperPreview.A01);
                        }
                        if (outputStream == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("gallerywallpaperpreview/outputstream/failed to open output stream for ");
                            sb.append(galleryWallpaperPreview.A01.getPath());
                            Log.i(sb.toString());
                            galleryWallpaperPreview.setResult(0, new Intent().putExtra("io-error", true));
                            return;
                        }
                        fullViewCroppedBitmap.compress(Bitmap.CompressFormat.JPEG, i, outputStream);
                        i -= 10;
                        C006803i.A0Z(outputStream);
                        if (galleryWallpaperPreview.A00 <= 0 || i <= 0 || !file.exists()) {
                        }
                    } catch (FileNotFoundException e) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("gallerywallpaperpreview/file not found at ");
                        sb2.append(galleryWallpaperPreview.A01.getPath());
                        Log.e(sb2.toString(), e);
                        galleryWallpaperPreview.setResult(0, new Intent().putExtra("io-error", true));
                        C006803i.A0Z(outputStream);
                        return;
                    } catch (Throwable th) {
                        C006803i.A0Z(outputStream);
                        throw th;
                    }
                } while (file.length() > ((long) galleryWallpaperPreview.A00));
                if (file.length() == 0 && galleryWallpaperPreview.A04.A02() == 0) {
                    Log.e("gallerywallpaperpreview/no space to save compressed image");
                    galleryWallpaperPreview.setResult(0, new Intent().putExtra("no-space", true));
                    return;
                }
                Intent intent5 = new Intent();
                intent5.setData(galleryWallpaperPreview.A01);
                intent5.putExtra("chat_jid", r14);
                galleryWallpaperPreview.setResult(-1, intent5);
                galleryWallpaperPreview.finish();
                return;
            }
            throw null;
        }
    }

    @Override // X.AnonymousClass0SB
    public void AKB(int i, int i2) {
        if (i == 100) {
            if (i2 == 0) {
                A0U(((AnonymousClass1U5) this).A00);
            } else {
                A0U(null);
            }
        }
    }

    public void lambda$onCreate$2500$AbstractWallpaperPreview(View view) {
        AnonymousClass02N r1;
        String A08;
        String A06;
        if (!((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A2e) || (r1 = ((AnonymousClass1U5) this).A00) == null || !((AnonymousClass1U5) this).A01) {
            A0U(((AnonymousClass1U5) this).A00);
            return;
        }
        AnonymousClass01A r0 = this.A01;
        C014308b r2 = this.A02;
        AnonymousClass01X r7 = ((AnonymousClass2C0) this).A01;
        C007003k A09 = r0.A09(r1);
        if (A09 != null) {
            if (!AnonymousClass1VY.A0T(A09.A09) || !TextUtils.isEmpty(A09.A0F)) {
                A08 = r2.A08(A09, false);
            } else {
                Jid A022 = A09.A02(AnonymousClass0OP.class);
                if (A022 != null) {
                    A08 = r2.A0A((AnonymousClass02X) A022);
                } else {
                    throw null;
                }
            }
            String A0D = r7.A0D(R.string.wallpaper_dialog_set_wallpaper_for_this_chat, A08);
            if (C002001d.A3E(this)) {
                A06 = r7.A06(R.string.wallpaper_dialog_set_wallpaper_for_all_chats_dark_theme);
            } else {
                A06 = r7.A06(R.string.wallpaper_dialog_set_wallpaper_for_all_chats_light_theme);
            }
            String[] strArr = {A0D, A06};
            WallpaperSetConfirmationDialogFragment wallpaperSetConfirmationDialogFragment = new WallpaperSetConfirmationDialogFragment();
            Bundle A002 = SingleSelectionDialogFragment.A00(100, 0, R.string.wallpaper_dialog_set_wallpaper, strArr);
            A002.putBoolean("showConfirmation", true);
            wallpaperSetConfirmationDialogFragment.A0N(A002);
            APm(wallpaperSetConfirmationDialogFragment);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass1U5, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A2e)) {
            setTitle(R.string.wallpaper_preview_header);
        } else {
            setTitle(R.string.wallpaper_preview);
        }
        Button button = (Button) AnonymousClass0TX.A0A(this, R.id.set_wallpaper_button);
        this.A00 = button;
        button.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 32));
    }
}
