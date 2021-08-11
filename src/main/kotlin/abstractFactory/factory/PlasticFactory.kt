package abstractFactory.factory

import abstractFactory.doors.Door
import abstractFactory.doors.PlasticDoor
import abstractFactory.windows.PlasticWindow
import abstractFactory.windows.Window

class PlasticFactory: FurnitureFactory {
    override fun createDoor(): Door {
        return PlasticDoor()
    }

    override fun createWindow(): Window {
        return PlasticWindow()
    }
}