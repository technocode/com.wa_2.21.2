package com.whatsapp.camera;

import X.AbstractC07280Wv;
import X.AbstractC48882Od;
import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass02R;
import X.AnonymousClass037;
import X.AnonymousClass0Q7;
import X.AnonymousClass0YW;
import X.AnonymousClass2E9;
import X.AnonymousClass2PG;
import X.AnonymousClass2UT;
import X.AnonymousClass2WM;
import X.AnonymousClass2WN;
import X.C002001d;
import X.C004302a;
import X.C06470Tj;
import X.C08340aw;
import X.C28051Sr;
import X.C59592ny;
import X.C60522pc;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class CameraMediaPickerFragment extends MediaGalleryFragmentBase {
    public BroadcastReceiver A00;
    public MenuItem A01;
    public Toolbar A02;
    public Toolbar A03;
    public final AnonymousClass02M A04 = AnonymousClass02M.A00();
    public final AnonymousClass01X A05 = AnonymousClass01X.A00();
    public final C08340aw A06 = new C08340aw();
    public final HashSet A07 = new LinkedHashSet();
    public final List A08 = new ArrayList();

    @Override // X.AnonymousClass037, com.whatsapp.gallery.MediaGalleryFragmentBase
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.camera_gallery, viewGroup, false);
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallery.MediaGalleryFragmentBase
    public void A0c() {
        super.A0c();
        StickyHeadersRecyclerView stickyHeadersRecyclerView = ((MediaGalleryFragmentBase) this).A07;
        if (stickyHeadersRecyclerView != null) {
            int childCount = stickyHeadersRecyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ((MediaGalleryFragmentBase) this).A07.getChildAt(i);
                if (childAt instanceof C60522pc) {
                    ((ImageView) childAt).setImageDrawable(null);
                }
            }
        }
    }

    @Override // X.AnonymousClass037
    public void A0d() {
        this.A0U = true;
        BroadcastReceiver broadcastReceiver = this.A00;
        if (broadcastReceiver != null) {
            A0A().unregisterReceiver(broadcastReceiver);
            this.A00 = null;
        }
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallery.MediaGalleryFragmentBase
    public void A0e() {
        super.A0e();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addDataScheme("file");
        AnonymousClass2E9 r1 = new AnonymousClass2E9(this);
        this.A00 = r1;
        A0A().registerReceiver(r1, intentFilter);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e1  */
    @Override // X.AnonymousClass037
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0g(int r9, int r10, android.content.Intent r11) {
        /*
        // Method dump skipped, instructions count: 338
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraMediaPickerFragment.A0g(int, int, android.content.Intent):void");
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallery.MediaGalleryFragmentBase
    public void A0j(Bundle bundle) {
        bundle.putInt("sort_type", ((MediaGalleryFragmentBase) this).A02);
        bundle.putParcelableArrayList("android.intent.extra.STREAM", new ArrayList<>(this.A07));
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.A03 = toolbar;
        AnonymousClass01X r3 = this.A05;
        toolbar.setNavigationIcon(new C06470Tj(r3, C002001d.A0b(A00(), R.drawable.ic_back_teal, R.color.tealActionBarItemDrawableTint)));
        this.A03.setNavigationContentDescription(r3.A06(R.string.back));
        this.A03.getMenu().add(0, R.id.menuitem_select_multiple, 0, r3.A06(R.string.select_multiple)).setIcon(C002001d.A0b(A00(), R.drawable.ic_action_select_multiple_teal, R.color.tealActionBarItemDrawableTint)).setShowAsAction(2);
        Toolbar toolbar2 = this.A03;
        toolbar2.A0R = new AnonymousClass2WM(this);
        toolbar2.setNavigationOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 29));
        Toolbar toolbar3 = (Toolbar) view.findViewById(R.id.gallery_action_mode_bar);
        this.A02 = toolbar3;
        MenuItem add = toolbar3.getMenu().add(0, R.id.menuitem_select_multiple, 0, r3.A06(R.string.ok));
        this.A01 = add;
        add.setShowAsAction(2);
        this.A02.setNavigationIcon(new C06470Tj(r3, C004302a.A03(A00(), R.drawable.ic_back)));
        this.A02.setNavigationContentDescription(r3.A06(R.string.back));
        Toolbar toolbar4 = this.A02;
        toolbar4.A0R = new AnonymousClass2WN(this);
        toolbar4.setNavigationOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 30));
    }

    public final void A0y() {
        if (this.A02.getVisibility() != 0) {
            this.A02.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(120);
            this.A02.startAnimation(alphaAnimation);
        }
        this.A03.setVisibility(4);
        A10();
    }

    public final void A0z() {
        if (this.A02.getVisibility() != 4) {
            this.A02.setVisibility(4);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(120);
            this.A02.startAnimation(alphaAnimation);
        }
        this.A03.setVisibility(0);
        this.A07.clear();
        this.A06.A00.clear();
        ((MediaGalleryFragmentBase) this).A06.A01.A00();
    }

    public final void A10() {
        HashSet hashSet = this.A07;
        if (hashSet.isEmpty()) {
            this.A02.setTitle(this.A05.A06(R.string.select_multiple_title));
        } else {
            this.A02.setTitle(this.A05.A0A(R.plurals.n_selected, (long) hashSet.size(), Integer.valueOf(hashSet.size())));
        }
        this.A01.setVisible(true ^ hashSet.isEmpty());
    }

    public final void A11(AbstractC48882Od r5) {
        if (r5 != null) {
            if (A0w()) {
                HashSet hashSet = this.A07;
                Uri A4W = r5.A4W();
                if (hashSet.contains(A4W)) {
                    hashSet.remove(A4W);
                } else if (hashSet.size() < 30) {
                    hashSet.add(A4W);
                    this.A06.A03(new AnonymousClass2PG(A4W));
                } else {
                    this.A04.A0C(C28051Sr.A0s(this.A05, 30), 0);
                }
                if (hashSet.isEmpty()) {
                    A0z();
                } else {
                    A10();
                    A0s(hashSet.size());
                }
                ((MediaGalleryFragmentBase) this).A06.A01.A00();
                return;
            }
            HashSet hashSet2 = new HashSet();
            Uri A4W2 = r5.A4W();
            hashSet2.add(A4W2);
            this.A06.A03(new AnonymousClass2PG(A4W2));
            A12(hashSet2);
        }
    }

    public final void A12(HashSet hashSet) {
        AnonymousClass0YW A5A;
        Bitmap bitmap;
        AbstractC48882Od r8;
        C59592ny A0o;
        if (hashSet != null && !hashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashSet);
            ActivityC004902h A0A = A0A();
            if ((A0A instanceof AbstractC07280Wv) && (A5A = ((AbstractC07280Wv) A0A).A5A()) != null) {
                ArrayList arrayList2 = null;
                if (!AnonymousClass2UT.A00 || arrayList.size() != 1 || ((AnonymousClass037) this).A0A == null || (A0o = A0o((Uri) arrayList.get(0))) == null) {
                    bitmap = null;
                    r8 = null;
                } else {
                    arrayList2 = new ArrayList();
                    arrayList2.add(new AnonymousClass02R(A0o, arrayList.get(0).toString()));
                    View findViewById = ((AnonymousClass037) this).A0A.findViewById(R.id.gallery_header_transition);
                    arrayList2.add(new AnonymousClass02R(findViewById, AnonymousClass0Q7.A0G(findViewById)));
                    View findViewById2 = ((AnonymousClass037) this).A0A.findViewById(R.id.gallery_footer_transition);
                    arrayList2.add(new AnonymousClass02R(findViewById2, AnonymousClass0Q7.A0G(findViewById2)));
                    View findViewById3 = ((AnonymousClass037) this).A0A.findViewById(R.id.gallery_send_button_transition);
                    arrayList2.add(new AnonymousClass02R(findViewById3, AnonymousClass0Q7.A0G(findViewById3)));
                    bitmap = A0o.A00;
                    r8 = A0o.A04;
                }
                A5A.A0K(arrayList, arrayList2, bitmap, r8, this);
            }
        }
    }
}
