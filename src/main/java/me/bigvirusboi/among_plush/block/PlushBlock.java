package me.bigvirusboi.among_plush.block;

import me.bigvirusboi.among_plush.init.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PlushBlock extends Block {
    public static final VoxelShape SHAPE = makeShape();

    public static VoxelShape makeShape(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.or(shape, Shapes.box(0.3125, 0, 0.4375, 0.4375, 0.125, 0.5625));
        shape = Shapes.or(shape, Shapes.box(0.5625, 0, 0.4375, 0.6875, 0.125, 0.5625));
        shape = Shapes.or(shape, Shapes.box(0.25, 0.125, 0.375, 0.75, 0.875, 0.625));
        shape = Shapes.or(shape, Shapes.box(0.3125, 0.5625, 0.3125, 0.6875, 0.75, 0.4375));
        shape = Shapes.or(shape, Shapes.box(0.3125, 0.3125, 0.5625, 0.6875, 0.6875, 0.75));
        return shape;
    }

    public PlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return SHAPE;
    }

    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        level.playSound(null, blockPos, ModSounds.AMOGUS, SoundSource.BLOCKS, 0.5F, 1.0F);
        return super.use(blockState, level, blockPos, player, interactionHand, blockHitResult);
    }
}
