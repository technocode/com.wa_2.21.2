package com.whatsapp.gallerypicker;

import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass03S;
import X.AnonymousClass08D;
import X.AnonymousClass0JW;
import X.AnonymousClass2P0;
import X.AnonymousClass2P1;
import X.AnonymousClass2P4;
import X.AnonymousClass2PB;
import X.AnonymousClass2PM;
import X.C002101e;
import X.C004302a;
import X.C10460ef;
import X.C53982eA;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.SquareImageView;
import com.whatsapp.base.WaFragment;

public class GalleryPickerFragment extends WaFragment {
    public static final String A0I;
    public static final AnonymousClass2P4[] A0J;
    public static final AnonymousClass2P4[] A0K;
    public int A00 = 1;
    public int A01;
    public int A02;
    public BroadcastReceiver A03;
    public ContentObserver A04;
    public Drawable A05;
    public Handler A06 = new Handler(Looper.getMainLooper());
    public View A07;
    public RecyclerView A08;
    public C10460ef A09;
    public C53982eA A0A;
    public AnonymousClass2PM A0B;
    public boolean A0C;
    public boolean A0D;
    public final AnonymousClass08D A0E = AnonymousClass08D.A00();
    public final AnonymousClass03S A0F = AnonymousClass03S.A00();
    public final AnonymousClass01X A0G = AnonymousClass01X.A00();
    public final AnonymousClass00T A0H = C002101e.A00();

    static {
        String str = AnonymousClass2PB.A00;
        A0I = str;
        A0J = new AnonymousClass2P4[]{new AnonymousClass2P4(4, 1, str, R.string.gallery_camera_images_bucket_name), new AnonymousClass2P4(5, 4, str, R.string.gallery_camera_videos_bucket_name), new AnonymousClass2P4(6, 2, str, R.string.gallery_camera_images_bucket_name), new AnonymousClass2P4(0, 1, null, R.string.all_images), new AnonymousClass2P4(1, 4, null, R.string.all_videos), new AnonymousClass2P4(2, 2, null, R.string.all_gifs)};
        A0K = new AnonymousClass2P4[]{new AnonymousClass2P4(7, 7, str, R.string.gallery_camera_bucket_name), new AnonymousClass2P4(3, 7, null, R.string.all_media), new AnonymousClass2P4(1, 4, null, R.string.all_videos)};
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.gallery_picker_fragment, viewGroup, false);
    }

    @Override // X.AnonymousClass037
    public void A0b(Bundle bundle) {
        ContentResolver contentResolver;
        ContentResolver contentResolver2;
        this.A0U = true;
        this.A00 = super.A06.getInt("include");
        int A002 = C004302a.A00(A00(), R.color.gallery_cell);
        this.A01 = A002;
        this.A05 = new ColorDrawable(A002);
        this.A02 = A02().getDimensionPixelSize(R.dimen.gallery_picker_folder_thumb_size);
        View view = super.A0A;
        if (view != null) {
            this.A08 = (RecyclerView) view.findViewById(R.id.albums);
            this.A03 = new AnonymousClass2P0(this);
            this.A04 = new AnonymousClass2P1(this, this.A06);
            C53982eA r1 = new C53982eA(this);
            this.A0A = r1;
            this.A08.setAdapter(r1);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
            intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
            intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
            intentFilter.addAction("android.intent.action.MEDIA_EJECT");
            intentFilter.addDataScheme("file");
            A0A().registerReceiver(this.A03, intentFilter);
            ActivityC004902h A0A2 = A0A();
            if (A0A2 == null) {
                contentResolver = null;
            } else {
                contentResolver = A0A2.getContentResolver();
            }
            if (contentResolver != null) {
                contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.A04);
                AnonymousClass08D r3 = this.A0E;
                ActivityC004902h A0A3 = A0A();
                if (A0A3 == null) {
                    contentResolver2 = null;
                } else {
                    contentResolver2 = A0A3.getContentResolver();
                }
                this.A0B = new AnonymousClass2PM(r3, contentResolver2, this.A06);
                this.A0D = false;
                this.A0C = false;
                A0o();
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        ContentResolver contentResolver;
        this.A0U = true;
        C10460ef r0 = this.A09;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A09 = null;
        }
        AnonymousClass2PM r02 = this.A0B;
        if (r02 != null) {
            r02.A00();
            this.A0B = null;
        }
        A0A().unregisterReceiver(this.A03);
        ActivityC004902h A0A2 = A0A();
        if (A0A2 == null) {
            contentResolver = null;
        } else {
            contentResolver = A0A2.getContentResolver();
        }
        if (contentResolver != null) {
            contentResolver.unregisterContentObserver(this.A04);
            for (int i = 0; i < this.A08.getChildCount(); i++) {
                View childAt = this.A08.getChildAt(i);
                if (childAt instanceof FrameLayout) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        View childAt2 = viewGroup.getChildAt(i2);
                        if (childAt2 instanceof SquareImageView) {
                            ((ImageView) childAt2).setImageDrawable(null);
                        }
                    }
                }
            }
            this.A0A = null;
            this.A08.setAdapter(null);
            this.A0E.A03().A00.A06(-1);
            return;
        }
        throw null;
    }

    public final void A0n() {
        if (this.A07 == null) {
            View view = super.A0A;
            if (view != null) {
                ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.root);
                A0A().getLayoutInflater().inflate(R.layout.gallery_picker_no_images, viewGroup);
                View findViewById = viewGroup.findViewById(R.id.no_media);
                this.A07 = findViewById;
                TextView textView = (TextView) findViewById.findViewById(R.id.no_media_text);
                int i = this.A00;
                if (i == 1) {
                    textView.setText(this.A0G.A06(R.string.image_gallery_NoImageView_text));
                } else if (i == 2) {
                    textView.setText(this.A0G.A06(R.string.image_gallery_NoGifView_text));
                } else if (i == 4) {
                    textView.setText(this.A0G.A06(R.string.image_gallery_NoVideoView_text));
                }
            } else {
                throw null;
            }
        }
        this.A07.setVisibility(0);
    }

    public final void A0o() {
        boolean z = false;
        if (this.A09 == null) {
            z = true;
        }
        AnonymousClass00E.A08(z, "galleryFoldersTask must be cancelled");
        if (!this.A0F.A06()) {
            A0n();
            return;
        }
        Point point = new Point();
        A0A().getWindowManager().getDefaultDisplay().getSize(point);
        int i = point.y * point.x;
        int i2 = this.A02;
        C10460ef r2 = new C10460ef(this, this.A00, (i / (i2 * i2)) + 1);
        this.A09 = r2;
        this.A0H.ANC(r2, new Void[0]);
    }

    public final void A0p(boolean z, boolean z2) {
        StringBuilder A0S = AnonymousClass008.A0S("gallerypicker/");
        A0S.append(this.A00);
        A0S.append("/rebake unmounted:");
        A0S.append(z);
        A0S.append(" scanning:");
        A0S.append(z2);
        A0S.append(" oldunmounted:");
        A0S.append(this.A0D);
        A0S.append(" oldscanning:");
        AnonymousClass008.A1a(A0S, this.A0C);
        if (z != this.A0D || z2 != this.A0C) {
            this.A0D = z;
            this.A0C = z2;
            C10460ef r0 = this.A09;
            if (r0 != null) {
                ((AnonymousClass0JW) r0).A00.cancel(true);
                this.A09 = null;
            }
            if (this.A0D || !this.A0F.A06()) {
                A0n();
                return;
            }
            View view = this.A07;
            if (view != null) {
                view.setVisibility(8);
            }
            A0o();
        }
    }
}
