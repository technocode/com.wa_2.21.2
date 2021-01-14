package X;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.MediaGalleryFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2ds  reason: invalid class name and case insensitive filesystem */
public class C53812ds extends AbstractC16300pa implements AnonymousClass1O2 {
    public int A00 = 10;
    public long A01 = 0;
    public boolean A02;
    public final Map A03 = new HashMap();
    public final /* synthetic */ MediaGalleryFragmentBase A04;

    public C53812ds(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        this.A04 = mediaGalleryFragmentBase;
        A04(true);
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A04.A00;
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        C59592ny r1;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A04;
        if (mediaGalleryFragmentBase instanceof StorageUsageMediaGalleryFragment) {
            r1 = new C60512pb(mediaGalleryFragmentBase.A0A());
        } else if (mediaGalleryFragmentBase instanceof MediaPickerFragment) {
            r1 = new C60522pc(mediaGalleryFragmentBase.A0A());
        } else if (!(mediaGalleryFragmentBase instanceof MediaGalleryFragment)) {
            r1 = new C60522pc(mediaGalleryFragmentBase.A0A());
        } else {
            C60512pb r12 = new C60512pb(mediaGalleryFragmentBase.A0A());
            r12.A00 = 2;
            r1 = r12;
        }
        return new C53822dt(mediaGalleryFragmentBase, r1);
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r11, int i) {
        C53822dt r112 = (C53822dt) r11;
        int i2 = this.A00;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A04;
        if (i2 < mediaGalleryFragmentBase.A07.getChildCount()) {
            int childCount = mediaGalleryFragmentBase.A07.getChildCount();
            this.A00 = childCount;
            C16460pq A002 = mediaGalleryFragmentBase.A07.getRecycledViewPool().A00(1);
            A002.A00 = childCount;
            ArrayList arrayList = A002.A03;
            while (arrayList.size() > childCount) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        C59592ny r3 = (C59592ny) r112.A0H;
        r3.A00 = null;
        r3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        AbstractC48892Oe r0 = mediaGalleryFragmentBase.A08;
        if (r0 != null) {
            AbstractC48882Od A7I = r0.A7I(i);
            r3.setMediaItem(A7I);
            if (r3 instanceof C60512pb) {
                C60512pb r9 = (C60512pb) r3;
                boolean z = false;
                if (mediaGalleryFragmentBase.A02 == 3) {
                    z = true;
                }
                r9.A08 = z;
            }
            if (r3.getTag() instanceof AnonymousClass2PJ) {
                mediaGalleryFragmentBase.A0C.A01((AnonymousClass2PJ) r3.getTag());
            }
            if (A7I != null) {
                C53792dq r2 = new C53792dq(this, r3, r112, A7I);
                r3.setTag(r2);
                mediaGalleryFragmentBase.A0C.A02(r2, new C53802dr(this, r3, r2, A7I));
                r3.setChecked(mediaGalleryFragmentBase.A0x(i));
            } else {
                r3.setScaleType(ImageView.ScaleType.CENTER);
                r3.setBackgroundColor(mediaGalleryFragmentBase.A01);
                r3.setImageDrawable(null);
                r3.setChecked(false);
            }
            if (!this.A02) {
                this.A02 = true;
                r3.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC48942Oj(this, r3));
            }
        }
    }

    public final void A08(StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment, C53782dp r9, int i) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A04;
        if (mediaGalleryFragmentBase.A0E && mediaGalleryFragmentBase.A08 != null) {
            boolean isChecked = r9.A00.isChecked();
            int count = mediaGalleryFragmentBase.A08.getCount() - 1;
            int i2 = mediaGalleryFragmentBase.A02;
            boolean z = true;
            if (!(i2 == 0 || i2 == 1)) {
                z = false;
            }
            int i3 = 0;
            if (z) {
                int i4 = 0;
                while (i3 <= i) {
                    if (i3 == i) {
                        count = (((C08660bV) mediaGalleryFragmentBase.A0N.get(i3)).count + i4) - 1;
                    } else {
                        i4 += ((C08660bV) mediaGalleryFragmentBase.A0N.get(i3)).count;
                    }
                    i3++;
                }
                i3 = i4;
            }
            ArrayList arrayList = new ArrayList();
            while (i3 <= count) {
                AbstractC48882Od A7I = mediaGalleryFragmentBase.A08.A7I(i3);
                if (A7I != null && (A7I instanceof AbstractC53892e0)) {
                    arrayList.add(((AbstractC53892e0) A7I).A00);
                }
                i3++;
            }
            int size = arrayList.size();
            if (isChecked) {
                if (size != 0) {
                    if (!storageUsageMediaGalleryFragment.A0w()) {
                        storageUsageMediaGalleryFragment.A0y().AQ6((AbstractC007503q) arrayList.get(0));
                    }
                    storageUsageMediaGalleryFragment.A0y().AP3(arrayList, true);
                    ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A06.A01.A00();
                }
            } else if (size != 0) {
                storageUsageMediaGalleryFragment.A0y().AP3(arrayList, false);
                ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A06.A01.A00();
            }
        }
    }

    @Override // X.AnonymousClass1O2
    public int A5V(int i) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A04;
        int i2 = mediaGalleryFragmentBase.A02;
        if (i2 == 0 || i2 == 1) {
            return ((C08660bV) mediaGalleryFragmentBase.A0N.get(i)).count;
        }
        return mediaGalleryFragmentBase.A00;
    }

    @Override // X.AnonymousClass1O2
    public int A6d() {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A04;
        int i = mediaGalleryFragmentBase.A02;
        if (i == 0 || i == 1) {
            return mediaGalleryFragmentBase.A0N.size();
        }
        return 1;
    }

    @Override // X.AnonymousClass1O2
    public long A6e(int i) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A04;
        int i2 = mediaGalleryFragmentBase.A02;
        if (i2 == 0 || i2 == 1) {
            return -((Calendar) mediaGalleryFragmentBase.A0N.get(i)).getTimeInMillis();
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0 == 1) goto L_0x003f;
     */
    @Override // X.AnonymousClass1O2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ADX(X.AbstractC11910hD r9, int r10) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53812ds.ADX(X.0hD, int):void");
    }

    @Override // X.AnonymousClass1O2
    public AbstractC11910hD AEj(ViewGroup viewGroup) {
        AnonymousClass01X r3 = this.A04.A0L;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.media_gallery_section_row, viewGroup, false);
        AnonymousClass0Q7.A0X(inflate, !r3.A0M());
        inflate.setClickable(false);
        return new C53782dp(inflate);
    }

    @Override // X.AnonymousClass1O2
    public boolean AKa(AbstractC11910hD r5, int i, MotionEvent motionEvent) {
        C53782dp r52 = (C53782dp) r5;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A04;
        if (!mediaGalleryFragmentBase.A0F) {
            return false;
        }
        float x = motionEvent.getX();
        CheckBox checkBox = r52.A00;
        if (x < checkBox.getX() || !mediaGalleryFragmentBase.A0E) {
            return false;
        }
        checkBox.setChecked(!checkBox.isChecked());
        A08((StorageUsageMediaGalleryFragment) mediaGalleryFragmentBase, r52, i);
        return true;
    }
}
