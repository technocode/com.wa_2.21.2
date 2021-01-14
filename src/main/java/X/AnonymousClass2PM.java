package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.provider.MediaStore;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2PM  reason: invalid class name */
public class AnonymousClass2PM {
    public boolean A00;
    public final ContentResolver A01;
    public final Handler A02;
    public final AnonymousClass0DD A03;
    public final Thread A04;
    public final ArrayList A05 = new ArrayList();

    public AnonymousClass2PM(AnonymousClass08D r3, ContentResolver contentResolver, Handler handler) {
        this.A01 = contentResolver;
        this.A02 = handler;
        this.A03 = r3.A03();
        this.A00 = false;
        Thread thread = new Thread(new RunnableEBaseShape9S0100000_I1_4(this));
        this.A04 = thread;
        thread.setName("image-loader");
        this.A04.start();
        StringBuilder sb = new StringBuilder("imageloader/cachesize:");
        sb.append(this.A03.A00.A00());
        Log.i(sb.toString());
    }

    public void A00() {
        ArrayList arrayList = this.A05;
        synchronized (arrayList) {
            this.A00 = true;
            arrayList.notifyAll();
        }
        C49072Ox A002 = C49072Ox.A00();
        Thread thread = this.A04;
        ContentResolver contentResolver = this.A01;
        synchronized (A002) {
            C49062Ow A032 = A002.A03(thread);
            A032.A00 = 0;
            BitmapFactory.Options options = A032.A01;
            if (options != null) {
                options.requestCancelDecode();
            }
            A002.notifyAll();
            synchronized (A032) {
                if (A032.A02) {
                    MediaStore.Images.Thumbnails.cancelThumbnailRequest(contentResolver, -1, thread.getId());
                    MediaStore.Video.Thumbnails.cancelThumbnailRequest(contentResolver, -1, thread.getId());
                }
            }
        }
        thread.interrupt();
    }

    public void A01(AnonymousClass2PJ r4) {
        if (r4 != null) {
            ArrayList arrayList = this.A05;
            synchronized (arrayList) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (((AnonymousClass2PL) arrayList.get(i)).A00 != r4) {
                        i++;
                    } else if (i >= 0) {
                        arrayList.remove(i);
                        return;
                    }
                }
            }
        }
    }

    public void A02(AnonymousClass2PJ r4, AnonymousClass2PK r5) {
        AnonymousClass00E.A08(!this.A04.isInterrupted(), "Thumb loader reused after destroy");
        Bitmap bitmap = (Bitmap) this.A03.A02(r4.A9J());
        if (bitmap != null) {
            r5.AKg(bitmap, true);
            return;
        }
        r5.A2A();
        ArrayList arrayList = this.A05;
        synchronized (arrayList) {
            arrayList.add(new AnonymousClass2PL(r4, r5));
            arrayList.notifyAll();
        }
    }
}
