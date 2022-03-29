package ru.vsu.cs.PoryadinAV;

public class SpecialListSorting {
    public SimpleLinkedList<Integer> specialSorting(SimpleLinkedList<Integer> list) throws SimpleLinkedList.SimpleLinkedListException {
        if (list.size() < 3) {
            return list;
        }

        int n = list.size() / 3;
        System.out.println("n = " + n);
        SimpleLinkedList<Integer> newList = new SimpleLinkedList<Integer>();

        for (int i = 0; i < n; i++) {
            int nullElement = list.get(i);
            int nElement = list.get(n + i);
            int doubleNElement = list.get(2 * n + i);

            newList.addLast(nullElement);
            newList.addLast(nElement);
            newList.addLast(doubleNElement);
        }

        return newList;
    }
}
