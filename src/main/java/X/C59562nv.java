package X;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.DocumentsGalleryFragment;
import com.whatsapp.gallery.GalleryFragmentBase;
import java.util.Calendar;

/* renamed from: X.2nv  reason: invalid class name and case insensitive filesystem */
public class C59562nv extends AbstractC39901sI implements AnonymousClass1O2 {
    public int A00;
    public final ContentObserver A01 = new C48852Oa(this, new Handler(Looper.getMainLooper()));
    public final /* synthetic */ DocumentsGalleryFragment A02;

    public C59562nv(DocumentsGalleryFragment documentsGalleryFragment) {
        this.A02 = documentsGalleryFragment;
    }

    @Override // X.AbstractC16300pa, X.AbstractC39901sI
    public int A05() {
        return this.A00;
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        DocumentsGalleryFragment documentsGalleryFragment = this.A02;
        ActivityC004902h A0A = documentsGalleryFragment.A0A();
        if (A0A != null) {
            return new C53682df(documentsGalleryFragment, A0A.getLayoutInflater().inflate(R.layout.document_media_item, viewGroup, false));
        }
        throw null;
    }

    @Override // X.AbstractC16300pa, X.AbstractC39901sI
    public void A07(AbstractC11910hD r2, int i) {
        Cursor cursor = ((AbstractC39901sI) this).A01;
        if (cursor != null && i < cursor.getCount()) {
            super.A07(r2, i);
        }
    }

    @Override // X.AbstractC39901sI
    public Cursor A08(Cursor cursor) {
        Cursor cursor2 = ((AbstractC39901sI) this).A01;
        if (cursor2 != null) {
            cursor2.unregisterContentObserver(this.A01);
        }
        if (cursor != null) {
            cursor.registerContentObserver(this.A01);
            this.A00 = cursor.getCount();
        } else {
            this.A00 = 0;
        }
        return super.A08(cursor);
    }

    @Override // X.AnonymousClass1O2
    public int A5V(int i) {
        return ((C08660bV) ((GalleryFragmentBase) this.A02).A0G.get(i)).count;
    }

    @Override // X.AnonymousClass1O2
    public int A6d() {
        return ((GalleryFragmentBase) this.A02).A0G.size();
    }

    @Override // X.AnonymousClass1O2
    public long A6e(int i) {
        return -((Calendar) ((GalleryFragmentBase) this.A02).A0G.get(i)).getTimeInMillis();
    }

    @Override // X.AnonymousClass1O2
    public void ADX(AbstractC11910hD r3, int i) {
        ((C53692dg) r3).A00.setText(((GalleryFragmentBase) this.A02).A0G.get(i).toString());
    }

    @Override // X.AnonymousClass1O2
    public AbstractC11910hD AEj(ViewGroup viewGroup) {
        DocumentsGalleryFragment documentsGalleryFragment = this.A02;
        ActivityC004902h A0A = documentsGalleryFragment.A0A();
        if (A0A != null) {
            View inflate = A0A.getLayoutInflater().inflate(R.layout.media_gallery_section_row, viewGroup, false);
            inflate.setClickable(false);
            Context A002 = documentsGalleryFragment.A00();
            if (A002 != null) {
                inflate.setBackgroundColor(C004302a.A00(A002, R.color.gallery_separator));
                return new C53692dg(inflate);
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass1O2
    public boolean AKa(AbstractC11910hD r2, int i, MotionEvent motionEvent) {
        return false;
    }
}
