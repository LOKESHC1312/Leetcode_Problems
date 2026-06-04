# Last updated: 6/4/2026, 10:20:18 PM
class Solution:
  def matchPlayersAndTrainers(
      self,
      players: list[int],
      trainers: list[int],
  ) -> int:
    ans = 0

    players.sort()
    trainers.sort()

    for i, trainer in enumerate(trainers):
      if players[ans] <= trainer:
        ans += 1
        if ans == len(players):
          return ans

    return ans 