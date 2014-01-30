package com.closure.achaia2.core.connections

import java.awt.event.{ActionEvent, ActionListener}
import org.openide.DialogDisplayer
import org.openide.NotifyDescriptor
import org.openide.awt.ActionID
import org.openide.awt.ActionReference
import org.openide.awt.ActionRegistration
import org.openide.util.NbBundle.Messages
import org.openide.windows.TopComponent
import com.closure.achaia2.core.connections.ConnectionsComponent

/**
 * Created by mwielocha on 29.01.2014.
 */

final class ShowConnectionsComponentAction extends ActionListener {

    lazy val instance = new ConnectionsComponent

    def actionPerformed(event: ActionEvent): Unit = {
        instance.open()
    }
}
