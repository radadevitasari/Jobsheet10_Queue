public class AntrianKRS19 {
    Mahasiswa19[] data;
    int front, rear, size, max;
    int sudahProses = 0;
    final int MAX_DPA = 30;

    public AntrianKRS19(int max) {
        this.max = max;
        data = new Mahasiswa19[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }
        public void enqueue(Mahasiswa19 m) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = m;
        size++;
        System.out.println(m.nama + " masuk antrian");
    }
        public void dequeue2Mahasiswa() {
        if (sudahProses >= MAX_DPA) {
            System.out.println("Kuota DPA sudah penuh!");
            return;
        }
        if (size < 2) {
            System.out.println("Minimal 2 mahasiswa untuk diproses!");
            return;
        }

        System.out.println("Diproses KRS:");

        for (int i = 0; i < 2; i++) {
            Mahasiswa19 m = data[front];
            m.tampilkanData();

            front = (front + 1) % max;
            size--;
            sudahProses++;
        }
    }
        public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData();
        }
    }
        public void tampilkan2Terdepan() {
        if (size < 2) {
            System.out.println("Kurang dari 2 mahasiswa");
            return;
        }

        for (int i = 0; i < 2; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }
        public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Kosong");
        } else {
            data[rear].tampilkanData();
        }
    }
    public void clear() {
    if (!isEmpty()) {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    } else {
        System.out.println("Antrian sudah kosong");
    }
}
    public int getJumlahAntrian() {
        return size;
}

    public int getSudahProses() {
        return sudahProses;
    }

    public int getBelumProses() {
    if (sudahProses >= MAX_DPA) {
        return 0;
    }
    return MAX_DPA - sudahProses;
    }
}

