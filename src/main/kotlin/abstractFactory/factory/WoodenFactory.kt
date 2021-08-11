package abstractFactory.factory

import abstractFactory.doors.Door
import abstractFactory.doors.WoodenDoor
import abstractFactory.windows.Window
import abstractFactory.windows.WoodenWindow

class WoodenFactory: FurnitureFactory {
    override fun createDoor(): Door {
        return WoodenDoor()
    }

    override fun createWindow(): Window {
        return WoodenWindow()
    }
}