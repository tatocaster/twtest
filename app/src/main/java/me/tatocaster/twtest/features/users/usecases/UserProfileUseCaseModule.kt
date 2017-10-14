package me.tatocaster.twtest.features.users.usecases

import dagger.Module
import dagger.Provides

/**
 * Created by tatocaster on 12.10.17.
 */
@Module
class UserProfileUseCaseModule {
    @Provides
    fun provideGetAllAvailableProviders(usecase: GetUserListImpl): GetUserList = usecase
}