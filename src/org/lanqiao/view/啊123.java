package org.lanqiao.view;

import javax.swing.*;
import java.awt.event.*;

public class ��123 extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public ��123() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // ���� X ʱ���� onCancel()
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // ���� ESCAPE ʱ���� onCancel()
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // �ڴ˴�������Ĵ���
        dispose();
    }

    private void onCancel() {
        // ��Ҫʱ�ڴ˴�������Ĵ���
        dispose();
    }

    public static void main(String[] args) {
        ��123 dialog = new ��123();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
