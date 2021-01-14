package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.0c2  reason: invalid class name and case insensitive filesystem */
public class C08950c2 {
    public final AnonymousClass0Wy A00;
    public final Random A01;
    public final SSLSocketFactory A02;

    public C08950c2(AnonymousClass03U r2, AnonymousClass0Wy r3, Random random) {
        this.A02 = r2.A02();
        this.A00 = r3;
        this.A01 = random;
    }

    public static C11270g0 A00(SSLSocketFactory sSLSocketFactory, InetSocketAddress inetSocketAddress, int i, boolean z, String str) {
        Socket createSocket = SocketFactory.getDefault().createSocket();
        if (str != null) {
            StringBuilder A0Y = AnonymousClass008.A0Y(str, "/try_connect/");
            A0Y.append(inetSocketAddress.getAddress());
            A0Y.append(" (method? ");
            A0Y.append(z);
            A0Y.append(')');
            Log.i(A0Y.toString());
        }
        createSocket.connect(inetSocketAddress, i);
        if (z) {
            createSocket = sSLSocketFactory.createSocket(createSocket, inetSocketAddress.getHostName(), inetSocketAddress.getPort(), true);
            ((SSLSocket) createSocket).startHandshake();
        }
        if (str != null) {
            AnonymousClass008.A16(str, "/try_connect/connected");
        }
        return new C11270g0(createSocket);
    }

    /* JADX INFO: finally extract failed */
    public C11270g0 A01(C11250fy r21) {
        C11270g0 r3;
        Object obj;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        InetAddress[] inetAddressArr = r21.A04;
        int length = inetAddressArr.length;
        for (InetAddress inetAddress : inetAddressArr) {
            if (inetAddress.getAddress().length > 4) {
                arrayList2.add(inetAddress);
            } else {
                arrayList.add(inetAddress);
            }
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 20) {
            z = true;
        }
        if (z) {
            if (!arrayList.isEmpty()) {
                InetSocketAddress inetSocketAddress = new InetSocketAddress((InetAddress) arrayList.get(this.A01.nextInt(arrayList.size())), r21.A00);
                StringBuilder sb = new StringBuilder("ConnectionSocketFactory/ipV4Only/try_connect/");
                sb.append(inetSocketAddress);
                sb.append(" (method? ");
                boolean z2 = r21.A03;
                sb.append(z2);
                sb.append(')');
                Log.i(sb.toString());
                return A00(this.A02, inetSocketAddress, 30000, z2, null);
            }
            throw new IOException("Connection sequence can connect to IpV4 only, but no IpV4 available.");
        } else if (arrayList.size() <= 0 || arrayList2.size() <= 0) {
            StringBuilder A0S = AnonymousClass008.A0S("ConnectionSocketFactory/try_connect/missing ip/ ipv4 found = ");
            boolean z3 = false;
            if (arrayList.size() > 0) {
                z3 = true;
            }
            A0S.append(z3);
            A0S.append("; ipv6 found = ");
            boolean z4 = false;
            if (arrayList2.size() > 0) {
                z4 = true;
            }
            A0S.append(z4);
            A0S.append(";");
            Log.d(A0S.toString());
            if (inetAddressArr != null) {
                InetSocketAddress inetSocketAddress2 = new InetSocketAddress(inetAddressArr[this.A01.nextInt(length)], r21.A00);
                StringBuilder sb2 = new StringBuilder("ConnectionSocketFactory/try_connect/");
                sb2.append(inetSocketAddress2);
                sb2.append(" (method? ");
                boolean z5 = r21.A03;
                sb2.append(z5);
                sb2.append(')');
                Log.i(sb2.toString());
                return A00(this.A02, inetSocketAddress2, 30000, z5, null);
            }
            throw null;
        } else {
            Random random = this.A01;
            InetSocketAddress inetSocketAddress3 = new InetSocketAddress((InetAddress) arrayList.get(random.nextInt(arrayList.size())), r21.A00);
            InetSocketAddress inetSocketAddress4 = new InetSocketAddress((InetAddress) arrayList2.get(random.nextInt(arrayList2.size())), r21.A00);
            AnonymousClass0Wy r8 = this.A00;
            boolean z6 = r21.A03;
            if (r8 != null) {
                AnonymousClass36K r12 = new AnonymousClass36K();
                synchronized (r8) {
                    r8.A01 = false;
                    if (r8.A00 == null) {
                        r8.A00 = r8.A02.A02();
                    }
                }
                Log.d("happyEyeball/tryConnect");
                ThreadPoolExecutor threadPoolExecutor = r8.A03;
                threadPoolExecutor.execute(new RunnableEBaseShape0S0311000_I0(r8, inetSocketAddress4, 30000, z6, r12, 2));
                try {
                    ReentrantLock reentrantLock = r12.A02;
                    reentrantLock.lockInterruptibly();
                    for (long nanos = TimeUnit.MILLISECONDS.toNanos(250); nanos > 0; nanos = r12.A01.awaitNanos(nanos)) {
                        try {
                            if (r12.A00 != null) {
                                break;
                            }
                        } catch (Throwable th) {
                            reentrantLock.unlock();
                            throw th;
                        }
                    }
                    Object obj2 = r12.A00;
                    reentrantLock.unlock();
                    Socket socket = (Socket) obj2;
                    if (socket != null) {
                        r3 = new C11270g0(socket);
                        StringBuilder A0S2 = AnonymousClass008.A0S("ConnectionSocketFactory/try_connect/happyEyeball/");
                        A0S2.append(r3.toString());
                        A0S2.append(" (method? ");
                        A0S2.append(z6);
                        A0S2.append(");");
                        Log.i(A0S2.toString());
                        return r3;
                    }
                    Log.i("happyEyeball/couldn't connect to ipv6 in 250 ms");
                    threadPoolExecutor.execute(new RunnableEBaseShape0S0311000_I0(r8, inetSocketAddress3, 30000, z6, r12, 3));
                    try {
                        ReentrantLock reentrantLock2 = r12.A02;
                        reentrantLock2.lockInterruptibly();
                        while (true) {
                            try {
                                obj = r12.A00;
                                if (obj != null) {
                                    break;
                                }
                                r12.A01.await();
                            } catch (Throwable th2) {
                                reentrantLock2.unlock();
                                throw th2;
                            }
                        }
                        reentrantLock2.unlock();
                        Socket socket2 = (Socket) obj;
                        if (!(socket2 == null || !socket2.isConnected() || socket2 == AnonymousClass0Wy.A04)) {
                            r3 = new C11270g0(socket2);
                            StringBuilder A0S22 = AnonymousClass008.A0S("ConnectionSocketFactory/try_connect/happyEyeball/");
                            A0S22.append(r3.toString());
                            A0S22.append(" (method? ");
                            A0S22.append(z6);
                            A0S22.append(");");
                            Log.i(A0S22.toString());
                            return r3;
                        }
                    } catch (InterruptedException e) {
                        Log.w("HappyEyeball", e);
                    }
                    throw new IOException("HappyEyeball/couldn't connect to neither of ips");
                } catch (InterruptedException e2) {
                    Log.e("HappyEyeball/try_connect exception short wait for ipv6", e2);
                }
            } else {
                throw null;
            }
        }
    }
}
