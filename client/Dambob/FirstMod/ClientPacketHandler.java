package client.Dambob.FirstMod;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import net.minecraft.src.INetworkManager;
import net.minecraft.src.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class ClientPacketHandler implements IPacketHandler
{
	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) 
	{
		DataInputStream data = new DataInputStream(new ByteArrayInputStream(packet.data));
	}

}
