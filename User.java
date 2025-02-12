class User {
    int id, age;
    String name;
    User next;
    FriendNode friends;

    User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.next = null;
        this.friends = null;
    }

    void addFriend(int friendId) {
        FriendNode newFriend = new FriendNode(friendId);
        if (friends == null) {
            friends = newFriend;
        } else {
            FriendNode temp = friends;
            while (temp.next != null) temp = temp.next;
            temp.next = newFriend;
        }
    }

    void removeFriend(int friendId) {
        if (friends == null) return;
        if (friends.id == friendId) {
            friends = friends.next;
            return;
        }
        FriendNode temp = friends;
        while (temp.next != null && temp.next.id != friendId) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    void displayFriends() {
        FriendNode temp = friends;
        while (temp != null) {
            System.out.print(temp.id + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class FriendNode {
    int id;
    FriendNode next;

    FriendNode(int id) {
        this.id = id;
        this.next = null;
    }
}

class SocialMedia {
    User head;

    void addUser(int id, String name, int age) {
        User newUser = new User(id, name, age);
        if (head == null) {
            head = newUser;
            return;
        }
        User temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newUser;
    }

    User searchUser(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    void addFriendConnection(int userId, int friendId) {
        User user = searchUser(userId);
        User friend = searchUser(friendId);
        if (user != null && friend != null) {
            user.addFriend(friendId);
            friend.addFriend(userId);
        }
    }

    void removeFriendConnection(int userId, int friendId) {
        User user = searchUser(userId);
        User friend = searchUser(friendId);
        if (user != null && friend != null) {
            user.removeFriend(friendId);
            friend.removeFriend(userId);
        }
    }

    void findMutualFriends(int userId1, int userId2) {
        User user1 = searchUser(userId1);
        User user2 = searchUser(userId2);
        if (user1 == null || user2 == null) return;
        FriendNode f1 = user1.friends;
        while (f1 != null) {
            FriendNode f2 = user2.friends;
            while (f2 != null) {
                if (f1.id == f2.id) System.out.print(f1.id + " ");
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    void displayUserFriends(int userId) {
        User user = searchUser(userId);
        if (user != null) user.displayFriends();
    }

    public static void main(String[] args) {
        SocialMedia network = new SocialMedia();
        network.addUser(1, "Alice", 25);
        network.addUser(2, "Bob", 24);
        network.addUser(3, "Charlie", 26);
        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.displayUserFriends(1);
        network.findMutualFriends(2, 3);
        network.removeFriendConnection(1, 2);
        network.displayUserFriends(1);
    }
}
