package X;

import android.database.AbstractCursor;
import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2Kh  reason: invalid class name and case insensitive filesystem */
public class C47942Kh extends AbstractCursor {
    public static final String[] A05 = {"_id", "_data", "date", "title", "mime_type", "media_type", "duration"};
    public int A00 = -1;
    public Cursor A01;
    public boolean A02;
    public final AnonymousClass01K A03;
    public final AnonymousClass02N A04;

    public double getDouble(int i) {
        return 0.0d;
    }

    public float getFloat(int i) {
        return 0.0f;
    }

    public int getInt(int i) {
        return 0;
    }

    public int getType(int i) {
        return (i == 0 || i == 2 || i == 5 || i == 6) ? 1 : 3;
    }

    public boolean isNull(int i) {
        return false;
    }

    public C47942Kh(AnonymousClass01K r2, AnonymousClass02N r3, Cursor cursor, boolean z) {
        this.A03 = r2;
        this.A01 = cursor;
        this.A04 = r3;
        this.A02 = z;
        moveToPosition(0);
    }

    public AnonymousClass0M3 A00() {
        AnonymousClass02N r2 = this.A04;
        if (r2 == null) {
            AnonymousClass01K r0 = this.A03;
            return (AnonymousClass0M3) r0.A0J.A02(this.A01);
        }
        AnonymousClass01K r02 = this.A03;
        return (AnonymousClass0M3) r02.A0J.A03(this.A01, r2);
    }

    public final boolean A01() {
        AnonymousClass0M4 r1;
        File file;
        AnonymousClass0M3 A002 = A00();
        if (A002 == null || (r1 = A002.A02) == null) {
            return false;
        }
        if ((!A002.A0n.A02 && !r1.A0P) || (file = r1.A0F) == null) {
            return this.A02 && (A002 instanceof AnonymousClass0ZC) && AnonymousClass0FI.A0v((AnonymousClass0ML) A002);
        }
        Uri fromFile = Uri.fromFile(file);
        if (fromFile == null || fromFile.getPath() == null) {
            return false;
        }
        return new File(fromFile.getPath()).exists();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Log.d("MediaCursor/close");
        super.close();
        this.A01.close();
    }

    public String[] getColumnNames() {
        return A05;
    }

    public int getCount() {
        int i = this.A00;
        return i < 0 ? this.A01.getCount() : i;
    }

    public long getLong(int i) {
        if (i == 0) {
            Cursor cursor = this.A01;
            return cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        } else if (i == 2) {
            AnonymousClass0M3 A002 = A00();
            if (A002 != null) {
                return A002.A0E;
            }
            throw null;
        } else if (i != 6) {
            return 0;
        } else {
            AnonymousClass0M3 A003 = A00();
            if (A003 != null) {
                return (long) A003.A00;
            }
            throw null;
        }
    }

    public short getShort(int i) {
        if (i != 5) {
            return 0;
        }
        AnonymousClass0M3 A002 = A00();
        if (A002 != null) {
            return (short) A002.A0m;
        }
        throw null;
    }

    public String getString(int i) {
        AnonymousClass0M4 r0;
        File file;
        if (i == 0) {
            Cursor cursor = this.A01;
            return Long.toString(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
        } else if (i == 1) {
            AnonymousClass0M3 A002 = A00();
            if (A002 == null || (r0 = A002.A02) == null || (file = r0.A0F) == null) {
                return "";
            }
            return file.getAbsolutePath();
        } else if (i == 2) {
            AnonymousClass0M3 A003 = A00();
            if (A003 != null) {
                return Long.toString(A003.A0E);
            }
            return "";
        } else if (i == 3) {
            AnonymousClass0M3 A004 = A00();
            if (A004 != null) {
                return A004.A0v();
            }
            throw null;
        } else if (i != 4) {
            return "";
        } else {
            AnonymousClass0M3 A005 = A00();
            if (A005 != null) {
                byte b = A005.A0m;
                if (b == 1) {
                    return "image/*";
                }
                if (b == 2) {
                    return "audio/*";
                }
                if (b == 3) {
                    return "video/*";
                }
                if (b != 9) {
                    if (b == 13) {
                        return "image/gif";
                    }
                    if (b == 23 || b == 37 || b == 25) {
                        return "image/*";
                    }
                    if (b != 26) {
                        if (b == 28) {
                            return "video/*";
                        }
                        if (b != 29) {
                            return "";
                        }
                        return "image/gif";
                    }
                }
                return A005.A07;
            }
            throw null;
        }
    }

    public boolean onMove(int i, int i2) {
        boolean z;
        boolean z2;
        if (i > (i2 << 1)) {
            this.A01.moveToPosition(-1);
            i = -1;
        }
        while (i2 > i) {
            int i3 = 0;
            while (true) {
                if (!this.A01.moveToNext()) {
                    z2 = false;
                    break;
                } else if (A01()) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 > 0) {
                AnonymousClass008.A0v("mediacursor/next/skip ", i3);
            }
            if (!z2) {
                this.A00 = i + 1;
                this.A01.moveToPosition(-1);
                AnonymousClass008.A1L(new StringBuilder("mediacursor/next/realcount "), this.A00);
                onChange(true);
                return false;
            }
            i++;
        }
        while (i2 < i) {
            int i4 = 0;
            while (true) {
                if (!this.A01.moveToPrevious()) {
                    z = false;
                    break;
                } else if (A01()) {
                    z = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 > 0) {
                AnonymousClass008.A0v("mediacursor/prev/skip ", i4);
            }
            if (!z) {
                this.A01.moveToPosition(-1);
                Log.i("mediacursor/prev/notfound");
                onChange(true);
                return false;
            }
            i--;
        }
        return true;
    }
}
