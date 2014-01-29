package com.closure.achaia2

import java.awt.event.{ActionEvent, ActionListener}
import org.openide.DialogDisplayer
import org.openide.NotifyDescriptor
import org.openide.awt.ActionID
import org.openide.awt.ActionReference
import org.openide.awt.ActionRegistration
import org.openide.util.NbBundle.Messages

/**
 * Created by mwielocha on 29.01.2014.
 */

final class SampleActionListener extends ActionListener {

    def actionPerformed(event: ActionEvent): Unit = {
        val d = new NotifyDescriptor.Message("Hi!")
        DialogDisplayer.getDefault.notify(d)
    }
}
