package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2TW  reason: invalid class name */
public class AnonymousClass2TW {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public List A05 = new ArrayList();
    public boolean A06;
    public boolean A07;

    public int A00(int i) {
        return ((Number) this.A05.get(i - 1)).intValue();
    }

    public void A01(InputStream inputStream, int i) {
        int i2 = this.A04;
        if (i2 != 6) {
            while (i2 != 6) {
                try {
                    int read = inputStream.read();
                    if (read != -1 && this.A00 < i) {
                        int i3 = this.A01 + 1;
                        this.A01 = i3;
                        if (this.A06) {
                            this.A04 = 6;
                            this.A06 = false;
                            return;
                        }
                        i2 = this.A04;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        if (i2 == 4) {
                                            this.A04 = 5;
                                            i2 = 5;
                                        } else if (i2 != 5) {
                                            AnonymousClass00E.A07(false);
                                        } else {
                                            int i4 = ((this.A02 << 8) + read) - 2;
                                            long j = (long) i4;
                                            while (j > 0) {
                                                long skip = inputStream.skip(j);
                                                if (skip <= 0) {
                                                    if (inputStream.read() == -1) {
                                                        break;
                                                    }
                                                    j--;
                                                } else {
                                                    j -= skip;
                                                }
                                            }
                                            this.A01 += i4;
                                            this.A04 = 2;
                                            i2 = 2;
                                        }
                                    } else if (read == 255) {
                                        this.A04 = 3;
                                        i2 = 3;
                                    } else if (read == 0) {
                                        this.A04 = 2;
                                        i2 = 2;
                                    } else if (read == 217) {
                                        this.A06 = true;
                                        int i5 = i3 - 2;
                                        if (this.A03 > 0) {
                                            this.A05.add(Integer.valueOf(i5));
                                        }
                                        int i6 = this.A03;
                                        this.A03 = i6 + 1;
                                        this.A00 = i6;
                                        this.A04 = 2;
                                        i2 = 2;
                                    } else if (!this.A07 && (read == 192 || read == 193 || read == 195 || read == 197 || read == 199 || read == 200 || read == 201 || read == 203 || read == 205 || read == 207)) {
                                        return;
                                    } else {
                                        if (read == 194 || read == 198 || read == 202 || read == 206) {
                                            this.A07 = true;
                                        } else {
                                            if (read == 218) {
                                                int i7 = i3 - 2;
                                                if (this.A03 > 0) {
                                                    this.A05.add(Integer.valueOf(i7));
                                                }
                                                int i8 = this.A03;
                                                this.A03 = i8 + 1;
                                                this.A00 = i8;
                                            } else {
                                                if (read != 1) {
                                                    if (read < 208 || read > 215) {
                                                        if (!(read == 217 || read == 216)) {
                                                        }
                                                    }
                                                }
                                                this.A04 = 2;
                                                i2 = 2;
                                            }
                                            this.A04 = 4;
                                            i2 = 4;
                                        }
                                    }
                                } else if (read == 255) {
                                    this.A04 = 3;
                                    i2 = 3;
                                }
                            } else if (read == 216) {
                                this.A04 = 2;
                                i2 = 2;
                            } else {
                                this.A04 = 6;
                                i2 = 6;
                            }
                        } else if (read == 255) {
                            this.A04 = 1;
                            i2 = 1;
                        } else {
                            this.A04 = 6;
                            i2 = 6;
                        }
                        this.A02 = read;
                    } else {
                        return;
                    }
                } catch (IOException unused) {
                    return;
                }
            }
        }
    }
}
