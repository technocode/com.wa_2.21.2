package com.whatsapp.gallery;

import X.AbstractC16300pa;
import X.AbstractC43421yL;
import X.AbstractC48882Od;
import X.AbstractC48892Oe;
import X.AbstractC48952Ok;
import X.AbstractC48962Ol;
import X.AbstractC53892e0;
import X.AbstractC59162nB;
import X.ActivityC004702f;
import X.ActivityC004902h;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass08D;
import X.AnonymousClass0JW;
import X.AnonymousClass0M2;
import X.AnonymousClass0M3;
import X.AnonymousClass0Q7;
import X.AnonymousClass0ZD;
import X.AnonymousClass2PM;
import X.AnonymousClass2UQ;
import X.AnonymousClass2UT;
import X.AnonymousClass2WU;
import X.AnonymousClass3RP;
import X.C002001d;
import X.C002101e;
import X.C002301g;
import X.C004302a;
import X.C007303n;
import X.C06470Tj;
import X.C10470eg;
import X.C10480eh;
import X.C10490ei;
import X.C48932Oi;
import X.C53652dc;
import X.C53662dd;
import X.C53672de;
import X.C53812ds;
import X.C53832du;
import X.C53842dv;
import X.C53852dw;
import X.C54112eN;
import X.C59592ny;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.base.WaFragment;
import com.whatsapp.camera.CameraMediaPickerFragment;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.gallerypicker.RecyclerFastScroller;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.util.Log;
import java.text.Format;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class MediaGalleryFragmentBase extends WaFragment {
    public static final Bitmap A0O = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public static final AbstractC48962Ol A0P;
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public Drawable A04;
    public View A05;
    public AbstractC16300pa A06;
    public StickyHeadersRecyclerView A07;
    public AbstractC48892Oe A08;
    public C10490ei A09;
    public C10480eh A0A;
    public C10470eg A0B;
    public AnonymousClass2PM A0C;
    public RecyclerFastScroller A0D;
    public boolean A0E;
    public boolean A0F;
    public final ContentObserver A0G;
    public final Handler A0H;
    public final AnonymousClass08D A0I;
    public final AnonymousClass03P A0J;
    public final AnonymousClass03S A0K;
    public final AnonymousClass01X A0L = AnonymousClass01X.A00();
    public final AnonymousClass00T A0M = C002101e.A00();
    public final ArrayList A0N = new ArrayList();

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            A0P = new C53832du();
        } else {
            A0P = new C53842dv();
        }
    }

    public MediaGalleryFragmentBase() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A0H = handler;
        this.A0G = new C48932Oi(this, handler);
        this.A0I = AnonymousClass08D.A00();
        this.A0J = AnonymousClass03P.A00();
        this.A0K = AnonymousClass03S.A00();
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.image_gallery, viewGroup, false);
    }

    @Override // X.AnonymousClass037
    public void A0b(Bundle bundle) {
        this.A0U = true;
        int i = 0;
        if (bundle == null) {
            Bundle bundle2 = super.A06;
            if (bundle2 != null) {
                this.A02 = bundle2.getInt("sort_type", 0);
            }
        } else {
            this.A02 = bundle.getInt("sort_type", 0);
        }
        int A002 = C004302a.A00(A00(), R.color.gallery_cell);
        this.A01 = A002;
        this.A04 = new ColorDrawable(A002);
        this.A03 = A02().getDimensionPixelSize(R.dimen.gallery_picker_item_thumb_size);
        this.A0F = this instanceof StorageUsageMediaGalleryFragment;
        View view = super.A0A;
        if (view != null) {
            this.A05 = view.findViewById(R.id.no_media);
            this.A07 = (StickyHeadersRecyclerView) view.findViewById(R.id.grid);
            C53812ds r1 = new C53812ds(this);
            this.A06 = r1;
            this.A07.setAdapter(r1);
            RecyclerFastScroller recyclerFastScroller = (RecyclerFastScroller) AnonymousClass0Q7.A0D(view, R.id.scroller);
            this.A0D = recyclerFastScroller;
            AnonymousClass01X r6 = this.A0L;
            recyclerFastScroller.A0A = r6.A02().A06;
            this.A0D.setRecyclerView(this.A07);
            ImageView imageView = new ImageView(A00());
            imageView.setImageDrawable(new C06470Tj(r6, C004302a.A03(A00(), R.drawable.fastscroll_media_thumb)));
            this.A0D.setThumbView(imageView);
            View inflate = A0A().getLayoutInflater().inflate(R.layout.media_fast_scroll_bubble, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.fast_scroll_date);
            C002301g.A03(textView);
            Format A6U = A0P.A6U(r6);
            RecyclerFastScroller recyclerFastScroller2 = this.A0D;
            recyclerFastScroller2.A08 = new C53672de(this, textView, A6U);
            recyclerFastScroller2.A02 = inflate;
            inflate.setVisibility(4);
            recyclerFastScroller2.addView(recyclerFastScroller2.A02, -2, -2);
            RecyclerFastScroller recyclerFastScroller3 = this.A0D;
            int i2 = this.A02;
            if (!(i2 == 0 || i2 == 1)) {
                i = 8;
            }
            recyclerFastScroller3.setVisibility(i);
            this.A0C = new AnonymousClass2PM(this.A0I, A0A().getContentResolver(), new Handler(Looper.getMainLooper()));
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        Log.i("mediagalleryfragmentbase/destroy");
        this.A0U = true;
        A0q();
        this.A0E = false;
        AnonymousClass2PM r0 = this.A0C;
        if (r0 != null) {
            r0.A00();
            this.A0C = null;
        }
        AbstractC48892Oe r1 = this.A08;
        if (r1 != null) {
            r1.unregisterContentObserver(this.A0G);
            this.A08.close();
            this.A08 = null;
        }
        this.A00 = 0;
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        A0p();
    }

    @Override // X.AnonymousClass037
    public void A0j(Bundle bundle) {
        bundle.putInt("sort_type", this.A02);
    }

    public AbstractC48952Ok A0n() {
        if (this instanceof StorageUsageMediaGalleryFragment) {
            return new AnonymousClass3RP((StorageUsageMediaGalleryFragment) this);
        }
        if (this instanceof MediaPickerFragment) {
            MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) this;
            ActivityC004902h A0A2 = mediaPickerFragment.A0A();
            if (A0A2 == null) {
                return null;
            }
            return new C54112eN(A0A2.getIntent().getData(), mediaPickerFragment.A00);
        } else if (!(this instanceof MediaGalleryFragment)) {
            return new AnonymousClass2WU(((CameraMediaPickerFragment) this).A08);
        } else {
            return new C53652dc((MediaGalleryFragment) this);
        }
    }

    public C59592ny A0o(Uri uri) {
        if (uri == null) {
            return null;
        }
        int childCount = this.A07.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.A07.getChildAt(i);
            if (childAt instanceof C59592ny) {
                C59592ny r1 = (C59592ny) childAt;
                if (uri.equals(r1.getUri())) {
                    return r1;
                }
            }
        }
        return null;
    }

    public void A0p() {
        if (this.A08 == null) {
            return;
        }
        if (!this.A0K.A06() || this.A08.getCount() <= 0) {
            this.A05.setVisibility(0);
            this.A07.setVisibility(8);
            return;
        }
        this.A05.setVisibility(8);
        this.A07.setVisibility(0);
    }

    public final void A0q() {
        C10480eh r0 = this.A0A;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A0A = null;
        }
        C10470eg r02 = this.A0B;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
            this.A0B = null;
        }
        C10490ei r03 = this.A09;
        if (r03 != null) {
            ((AnonymousClass0JW) r03).A00.cancel(true);
            this.A09 = null;
        }
    }

    public final void A0r() {
        if (this.A0F && this.A08 != null) {
            C10490ei r0 = this.A09;
            if (r0 != null) {
                ((AnonymousClass0JW) r0).A00.cancel(true);
            }
            this.A09 = new C10490ei(this.A08, new C53662dd(this));
            this.A0E = false;
            this.A06.A01.A00();
            this.A0M.ANC(this.A09, new Void[0]);
        }
    }

    public void A0s(int i) {
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null) {
            C002001d.A2R(A0A2, this.A0J, this.A0L.A0A(R.plurals.n_items_selected, (long) i, Integer.valueOf(i)));
        }
    }

    public void A0t(AbstractC48882Od r14, C59592ny r15) {
        if (this instanceof StorageUsageMediaGalleryFragment) {
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) this;
            AnonymousClass0M3 r11 = ((AbstractC53892e0) r14).A00;
            if (storageUsageMediaGalleryFragment.A0w()) {
                r15.setChecked(storageUsageMediaGalleryFragment.A0y().AQh(r11));
                ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A06.A01.A00();
            } else if (r14.A9V() != 4) {
                AnonymousClass2UQ r2 = new AnonymousClass2UQ(storageUsageMediaGalleryFragment.A0B());
                r2.A07 = true;
                r2.A05 = true;
                C007303n r1 = r11.A0n;
                r2.A03 = r1.A00;
                r2.A04 = r1;
                r2.A01 = 2;
                r2.A00 = 2;
                r2.A02 = r15;
                Intent A002 = r2.A00();
                Context A003 = storageUsageMediaGalleryFragment.A00();
                if (A003 != null) {
                    AnonymousClass2UT.A03(A003, storageUsageMediaGalleryFragment.A06, A002, r15, AbstractC59162nB.A07(r11));
                    return;
                }
                throw null;
            } else if (r11 instanceof AnonymousClass0M2) {
                AnonymousClass0ZD.A07(storageUsageMediaGalleryFragment.A0C, storageUsageMediaGalleryFragment.A04, storageUsageMediaGalleryFragment.A03, storageUsageMediaGalleryFragment.A0E, storageUsageMediaGalleryFragment.A0B, (ActivityC004702f) storageUsageMediaGalleryFragment.A0A(), (AnonymousClass0M2) r11, storageUsageMediaGalleryFragment.A02);
            }
        } else if (this instanceof MediaPickerFragment) {
            ((MediaPickerFragment) this).A0y(r14);
        } else if (!(this instanceof MediaGalleryFragment)) {
            ((CameraMediaPickerFragment) this).A11(r14);
        } else {
            MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) this;
            AnonymousClass0M3 r4 = ((AbstractC53892e0) r14).A00;
            if (mediaGalleryFragment.A0w()) {
                r15.setChecked(((AbstractC43421yL) mediaGalleryFragment.A0A()).AQh(r4));
                return;
            }
            AnonymousClass2UQ r12 = new AnonymousClass2UQ(mediaGalleryFragment.A0B());
            r12.A05 = true;
            r12.A03 = mediaGalleryFragment.A00;
            r12.A04 = r4.A0n;
            r12.A01 = 2;
            r12.A02 = r15;
            Intent A004 = r12.A00();
            Context A005 = mediaGalleryFragment.A00();
            if (A005 != null) {
                AnonymousClass2UT.A03(A005, mediaGalleryFragment.A01, A004, r15, AbstractC59162nB.A07(r4));
                return;
            }
            throw null;
        }
    }

    public void A0u(boolean z) {
        View view = super.A0A;
        if (view != null) {
            View findViewById = view.findViewById(R.id.progress_bar);
            int i = 8;
            if (z) {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
    }

    public void A0v(boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder("mediagalleryfragmentbase/rebake unmounted:");
        sb.append(z);
        sb.append(" scanning:");
        sb.append(z2);
        Log.i(sb.toString());
        A0q();
        AbstractC48892Oe r1 = this.A08;
        if (r1 != null) {
            r1.unregisterContentObserver(this.A0G);
            this.A08.close();
            this.A08 = null;
        }
        A0u(true);
        this.A00 = 0;
        this.A06.A01.A00();
        this.A0N.clear();
        AbstractC48952Ok A0n = A0n();
        if (A0n != null) {
            C10480eh r2 = new C10480eh(this, A0n, z);
            this.A0A = r2;
            this.A0M.ANC(r2, new Void[0]);
        }
    }

    public boolean A0w() {
        if (this instanceof StorageUsageMediaGalleryFragment) {
            return ((StorageUsageMediaGalleryFragment) this).A0y().AAO();
        }
        if (this instanceof MediaPickerFragment) {
            return ((MediaPickerFragment) this).A04 != null;
        }
        if (!(this instanceof MediaGalleryFragment)) {
            return ((CameraMediaPickerFragment) this).A02.getVisibility() == 0;
        }
        return ((AbstractC43421yL) A0A()).AAO();
    }

    public boolean A0x(int i) {
        AnonymousClass0M3 r1;
        if (this instanceof StorageUsageMediaGalleryFragment) {
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) this;
            AbstractC48892Oe r0 = ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A08;
            if (r0 == null) {
                return false;
            }
            AbstractC48882Od A7I = r0.A7I(i);
            if (!(A7I instanceof AbstractC53892e0) || (r1 = ((AbstractC53892e0) A7I).A00) == null || !storageUsageMediaGalleryFragment.A0y().ABK(r1)) {
                return false;
            }
            return true;
        } else if (this instanceof MediaPickerFragment) {
            MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) this;
            HashSet hashSet = mediaPickerFragment.A0E;
            AbstractC48892Oe r02 = ((MediaGalleryFragmentBase) mediaPickerFragment).A08;
            if (r02 != null) {
                return hashSet.contains(r02.A7I(i).A4W());
            }
            throw null;
        } else if (!(this instanceof MediaGalleryFragment)) {
            CameraMediaPickerFragment cameraMediaPickerFragment = (CameraMediaPickerFragment) this;
            return cameraMediaPickerFragment.A07.contains(((MediaGalleryFragmentBase) cameraMediaPickerFragment).A08.A7I(i).A4W());
        } else {
            AbstractC43421yL r12 = (AbstractC43421yL) A0A();
            AbstractC53892e0 A012 = ((C53852dw) this.A08).A7I(i);
            if (A012 != null) {
                return r12.ABK(A012.A00);
            }
            throw null;
        }
    }
}
