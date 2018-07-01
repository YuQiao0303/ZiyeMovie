# ZiyeMovie
A movie website

#数据库设计


Movie
(Mid,Mname,Myear,Mdate,Mbrief,
Mdirector,Mwriter1,Mwriter2,Mwriter3,Mstar1,Mstar2, Mstar3, Mstar4, Mstar5,
Munknown, Maction , Madventure , Manimation ,Mchildren's , Mcomedy , Mcrime , Mdocumentary , Mdrama , Mfantasy ,Mfilm-Noir , Mhorror , Mmusical , Mmystery , Mromance , Msci-fi ,Mthriller , Mwar , Mwestern,
Mrating,Mpicture
)

User
(Uid,Upassword,Unickname,Ugender,Uage,Uoccupation)
)

Rating
(Rid,Uid,Mid,rating)

Comment
(Cid,Uid,Mid,comment)

SearchHistory    
(Sid,Uid,content)

ViewHistory
(Vid,Uid,Mid)

YouMayLike
(Uid,Mid1,Mid2,Mid3,Mid5,Mid5,Mid6)

SimilarMovies
(Mid, Mid1,Mid2,Mid3,Mid5,Mid5,Mid6)
