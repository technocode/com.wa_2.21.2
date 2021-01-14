package X;

import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.1uy  reason: invalid class name and case insensitive filesystem */
public final class C41401uy extends AnonymousClass01G {
    public int A00 = -1;
    public int A01 = -1;

    public void A02() {
        Log.i("gdrive-service/backup-cancelled");
        this.A00 = 0;
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).ADJ();
                }
            }
        }
    }

    public void A03() {
        Log.i("gdrive-service/notify-media-restore-cancelled");
        this.A01 = -1;
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).AHY();
                }
            }
        }
    }

    public void A04() {
        this.A01 = 0;
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).AHg();
                }
            }
        }
    }

    public void A05() {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).ALU();
                }
            }
        }
    }

    public void A06(int i, Bundle bundle) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).AFh(i, bundle);
                }
            }
        }
    }

    public void A07(int i, Bundle bundle) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).AFi(i, bundle);
                }
            }
        }
    }

    public void A08(long j, long j2) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).ADN(j, j2);
                }
            }
        }
    }

    public void A09(long j, long j2) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).ADO(j, j2);
                }
            }
        }
    }

    public void A0A(long j, long j2) {
        int i;
        if (j2 > 0) {
            i = (int) ((100 * j) / j2);
        } else {
            i = -1;
        }
        if (j2 <= 0) {
            AnonymousClass008.A1P(AnonymousClass008.A0V("gdrive-service/backup-preparation-progress ", j, "/"), j2);
        }
        if (i != this.A00) {
            this.A00 = i;
            StringBuilder sb = new StringBuilder("gdrive-service/backup-preparation-progress/");
            sb.append(i);
            sb.append("%");
            Log.i(sb.toString());
            synchronized (super.A00) {
                Iterator it = super.A00.iterator();
                while (true) {
                    AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                    if (r1.hasNext()) {
                        ((AbstractC09090cH) r1.next()).ADQ(this.A00);
                    }
                }
            }
        }
    }

    public void A0B(long j, long j2) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).ADS(j, j2);
                }
            }
        }
    }

    public void A0C(long j, long j2) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).AHa(j, j2);
                }
            }
        }
    }

    public void A0D(long j, long j2) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).AHc(j, j2);
                }
            }
        }
    }

    public void A0E(long j, long j2) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).AHd(j, j2);
                }
            }
        }
    }

    public void A0F(long j, long j2) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).AHe(j, j2);
                }
            }
        }
    }

    public void A0G(long j, long j2, long j3) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).AHh(j, j2, j3);
                }
            }
        }
    }

    public void A0H(boolean z) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).ACZ(z);
                }
            }
        }
    }

    public void A0I(boolean z) {
        AnonymousClass008.A1H("gdrive-service/backup-end/success/", z);
        this.A00 = 0;
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).ADK(z);
                }
            }
        }
    }

    public void A0J(boolean z) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).AHl(z);
                }
            }
        }
    }

    public void A0K(boolean z, long j, long j2) {
        String str;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[3];
        if (z) {
            str = "successful";
        } else {
            str = "failed";
        }
        objArr[0] = str;
        objArr[1] = Long.valueOf(j);
        objArr[2] = Long.valueOf(j2);
        String.format(locale, "gdrive-service/notify-media-restore-end result:%s failed:%d total:%d", objArr);
        this.A01 = -1;
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC09090cH) r1.next()).AHZ(z, j, j2);
                }
            }
        }
    }
}
